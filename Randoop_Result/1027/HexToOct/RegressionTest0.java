package HexToOct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.thealgorithms.conversions.HexToOct hexToOct0 = new com.thealgorithms.conversions.HexToOct();
        java.lang.Class<?> wildcardClass1 = hexToOct0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 64 + "'", int1 == 64);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int1 = com.thealgorithms.conversions.HexToOct.hex2decimal("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(64);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        int int1 = com.thealgorithms.conversions.HexToOct.hex2decimal("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-273) + "'", int1 == (-273));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 141 + "'", int1 == 141);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((-273));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 43 + "'", int1 == 43);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 144 + "'", int1 == 144);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 144 + "'", int1 == 144);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 144 + "'", int1 == 144);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(50);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 62 + "'", int1 == 62);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(43);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(141);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 215 + "'", int1 == 215);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(144);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 220 + "'", int1 == 220);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(62);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(220);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 334 + "'", int1 == 334);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(76);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114 + "'", int1 == 114);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(114);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 162 + "'", int1 == 162);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(215);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 327 + "'", int1 == 327);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(162);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 242 + "'", int1 == 242);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(327);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 507 + "'", int1 == 507);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(334);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 516 + "'", int1 == 516);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(242);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 362 + "'", int1 == 362);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(362);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 552 + "'", int1 == 552);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(507);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 773 + "'", int1 == 773);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 101 + "'", int1 == 101);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(14);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(101);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 145 + "'", int1 == 145);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(516);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1004 + "'", int1 == 1004);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(773);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1405 + "'", int1 == 1405);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(552);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1050 + "'", int1 == 1050);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1405);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2575 + "'", int1 == 2575);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1004);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1754 + "'", int1 == 1754);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(2575);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5017 + "'", int1 == 5017);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1754);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3332 + "'", int1 == 3332);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(3332);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6404 + "'", int1 == 6404);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(6404);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14404 + "'", int1 == 14404);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(5017);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11631 + "'", int1 == 11631);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1050);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2032 + "'", int1 == 2032);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(11631);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26557 + "'", int1 == 26557);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(2032);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3760 + "'", int1 == 3760);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(26557);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63675 + "'", int1 == 63675);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(14404);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34104 + "'", int1 == 34104);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(30);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 36 + "'", int1 == 36);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(36);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(145);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 221 + "'", int1 == 221);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(63675);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 174273 + "'", int1 == 174273);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(174273);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 524301 + "'", int1 == 524301);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(221);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 335 + "'", int1 == 335);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(335);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 517 + "'", int1 == 517);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(524301);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2000015 + "'", int1 == 2000015);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(2000015);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7502217 + "'", int1 == 7502217);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(7502217);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34474611 + "'", int1 == 34474611);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(3760);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7260 + "'", int1 == 7260);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(44);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54 + "'", int1 == 54);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(34104);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102470 + "'", int1 == 102470);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(102470);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 310106 + "'", int1 == 310106);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(310106);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1135532 + "'", int1 == 1135532);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(517);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1005 + "'", int1 == 1005);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1005);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1755 + "'", int1 == 1755);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1755);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3333 + "'", int1 == 3333);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(7260);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16134 + "'", int1 == 16134);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(3333);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6405 + "'", int1 == 6405);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(54);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 66 + "'", int1 == 66);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1135532);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4251654 + "'", int1 == 4251654);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(4251654);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20160006 + "'", int1 == 20160006);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(6405);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14405 + "'", int1 == 14405);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(14405);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34105 + "'", int1 == 34105);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(34105);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102471 + "'", int1 == 102471);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(16134);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37406 + "'", int1 == 37406);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(37406);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 111036 + "'", int1 == 111036);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(102471);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 310107 + "'", int1 == 310107);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(310107);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1135533 + "'", int1 == 1135533);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(66);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102 + "'", int1 == 102);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(111036);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 330674 + "'", int1 == 330674);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(34474611);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 203405163 + "'", int1 == 203405163);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(203405163);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 192985188 + "'", int1 == 192985188);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(192985188);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 125385779 + "'", int1 == 125385779);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(102);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 146 + "'", int1 == 146);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(125385779);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-122757396) + "'", int1 == (-122757396));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(146);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 222 + "'", int1 == 222);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((-122757396));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(330674);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1205662 + "'", int1 == 1205662);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(222);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 336 + "'", int1 == 336);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1135533);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4251655 + "'", int1 == 4251655);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(20160006);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114717006 + "'", int1 == 114717006);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(114717006);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-193522943) + "'", int1 == (-193522943));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(336);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 520 + "'", int1 == 520);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(520);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1010 + "'", int1 == 1010);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1205662);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4462636 + "'", int1 == 4462636);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1010);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1762 + "'", int1 == 1762);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(4251655);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20160007 + "'", int1 == 20160007);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1762);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3342 + "'", int1 == 3342);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((-193522943));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(4462636);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21014054 + "'", int1 == 21014054);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(20160007);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114717007 + "'", int1 == 114717007);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(21014054);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 120123046 + "'", int1 == 120123046);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(120123046);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-146826213) + "'", int1 == (-146826213));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(3342);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6416 + "'", int1 == 6416);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(6416);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14420 + "'", int1 == 14420);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(114717007);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-193522942) + "'", int1 == (-193522942));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((-193522942));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((-146826213));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(14420);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34124 + "'", int1 == 34124);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(34124);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 102514 + "'", int1 == 102514);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(102514);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 310162 + "'", int1 == 310162);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(310162);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1135622 + "'", int1 == 1135622);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(1135622);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4252006 + "'", int1 == 4252006);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(4252006);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20160546 + "'", int1 == 20160546);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(20160546);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114720042 + "'", int1 == 114720042);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal(114720042);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-193517007) + "'", int1 == (-193517007));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int int1 = com.thealgorithms.conversions.HexToOct.decimal2octal((-193517007));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }
}

