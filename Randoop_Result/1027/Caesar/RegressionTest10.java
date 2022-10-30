package Caesar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`q!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`a!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{p!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`l!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`p!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{d!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{q!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{p!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`q!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{d!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{q!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("tu!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`x!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{g!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`e!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`l!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ef!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`a!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`v!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("``!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`d!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`d!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{s!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{z!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`d!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("q{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`x!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{l!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`u!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`r!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{v!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`e!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`t!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`l!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`m!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{p!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{q!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{h!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{s!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`n!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{a!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("bc!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`q!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{z!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{v!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }
}

