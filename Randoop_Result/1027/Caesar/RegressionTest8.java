package Caesar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`f!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`k!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`r!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{h!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`x!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`d!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{a!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("tu!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`k!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`n!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`f!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ab!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`s!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{h!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{a!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`q!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{f!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{h!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`e!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`r!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("``!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{t!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{q!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`e!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`k!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d{!" + "'", str2, "d{!");
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{l!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`u!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("bc!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("q`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("bc!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("``!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`r!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("tu!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("tu!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("tu!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`e!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{v!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{x!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`x!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("q{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`d!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{p!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`r!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`k!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{h!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`e!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`v!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r{!" + "'", str2, "r{!");
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{h!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{q!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`r!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c{!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{q!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{a!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`w!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{{!" + "'", str2, "{{!");
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`n!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`r!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s{!" + "'", str2, "s{!");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{t!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{h!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{a!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("``!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{g!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c{!" + "'", str2, "c{!");
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{p!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v{!" + "'", str2, "v{!");
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{x!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{f!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`s!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`x!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{l!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`a!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b{!" + "'", str2, "b{!");
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k{!" + "'", str2, "k{!");
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`p!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`s!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`v!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`s!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p{!" + "'", str2, "p{!");
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`d!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("u{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("u`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`v!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h{!" + "'", str2, "h{!");
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o{!" + "'", str2, "o{!");
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u{!" + "'", str2, "u{!");
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`r!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("m{!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i{!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m{!" + "'", str2, "m{!");
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k{!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l{!" + "'", str2, "l{!");
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`x!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{q!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t{!" + "'", str2, "t{!");
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b{!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }
}

