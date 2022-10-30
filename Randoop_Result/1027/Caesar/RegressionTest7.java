package Caesar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`v!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`n!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("fg!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`n!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`q!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`d!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`e!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`d!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{s!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`n!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{w!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{q!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`v!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{w!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`k!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`g!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`d!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("fg!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`k!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{s!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{o!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`u!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("q{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`t!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`r!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{x!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("cd!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("``!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`s!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`n!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("no!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{d!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{z!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{z!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`a!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`u!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`g!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("``!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{l!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`u!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{t!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`x!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`u!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("q{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`q!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("vw!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("lm!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`v!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`u!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`k!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("bc!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`k!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`x!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`k!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`w!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{p!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`v!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`n!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`g!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`u!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`l!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{q!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`l!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{f!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`f!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("bc!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("cd!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{h!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`t!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`l!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{z!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`f!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`q!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{w!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("q{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`f!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`i!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{x!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`r!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`e!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`k!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`r!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }
}

