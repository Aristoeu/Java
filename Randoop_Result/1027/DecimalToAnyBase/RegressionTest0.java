package DecimalToAnyBase;

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
        com.thealgorithms.conversions.DecimalToAnyBase decimalToAnyBase0 = new com.thealgorithms.conversions.DecimalToAnyBase();
        java.lang.Class<?> wildcardClass1 = decimalToAnyBase0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '4', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
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
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal(0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '0');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'g' + "'", char1 == 'g');
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (short) 0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal(100);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\233' + "'", char1 == '\233');
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '0', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g" + "'", str2, "g");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'A', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '4');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'k' + "'", char1 == 'k');
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((-1), 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) 'A');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'x' + "'", char1 == 'x');
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 100, (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1Z" + "'", str2, "1Z");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (short) 1);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (short) -1);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(0, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) -1, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(1, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'g', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) -1, (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) 'g');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\236' + "'", char1 == '\236');
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) ' ');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'W' + "'", char1 == 'W');
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) 'a');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\230' + "'", char1 == '\230');
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 100, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'x', (int) '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2C" + "'", str2, "2C");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '6');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'm' + "'", char1 == 'm');
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '4', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1H" + "'", str2, "1H");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\233', (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2P" + "'", str2, "2P");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'W', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "87" + "'", str2, "87");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(1, (int) 'g');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'm', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "109" + "'", str2, "109");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'W', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 10, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'k', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '#');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'Z' + "'", char1 == 'Z');
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 100, (int) 'A');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1Z" + "'", str2, "1Z");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(0, 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 0, (int) '\233');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (short) 10);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '6', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(100, (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1g" + "'", str2, "1g");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) -1, (int) 'Z');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'm', (int) '\233');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\244" + "'", str2, "\244");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '1');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'h' + "'", char1 == 'h');
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\233', (int) '\236');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\322" + "'", str2, "\322");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'h', (int) '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "28" + "'", str2, "28");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\236', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1q" + "'", str2, "1q");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'g', (int) 'm');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\236" + "'", str2, "\236");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((-1), (int) 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(10, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '0', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '0', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g" + "'", str2, "g");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) -1, (int) 'g');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 10, (int) 'm');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '1', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(100, (int) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\233" + "'", str2, "\233");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((-1));
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) 'x');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\257' + "'", char1 == '\257');
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 1, (int) '\230');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(10, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((-1), (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 1, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '0', (int) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g" + "'", str2, "g");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((-1), (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) 'h');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\237' + "'", char1 == '\237');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '0', (int) '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g" + "'", str2, "g");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '6' + "'", char1 == '6');
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '1', (int) 'W');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '0' + "'", char1 == '0');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\233', (int) '\230');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "13" + "'", str2, "13");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '6', (int) 'Z');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'Z', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "90" + "'", str2, "90");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\257');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\346' + "'", char1 == '\346');
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) 'Z');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\221' + "'", char1 == '\221');
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\230');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\317' + "'", char1 == '\317');
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(0, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\257', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3J" + "'", str2, "3J");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (short) 100);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\233' + "'", char1 == '\233');
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\233');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\322' + "'", char1 == '\322');
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\322', (int) '\237');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1j" + "'", str2, "1j");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'm', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "19" + "'", str2, "19");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k" + "'", str2, "k");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\230', (int) 'W');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1x" + "'", str2, "1x");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(0, (int) '\237');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 10, (int) 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\237');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\326' + "'", char1 == '\326');
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\322', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2G" + "'", str2, "2G");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\257', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "175" + "'", str2, "175");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\346');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u011d' + "'", char1 == '\u011d');
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\236', (int) '\230');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "16" + "'", str2, "16");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 0, 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\u011d');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u0154' + "'", char1 == '\u0154');
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\233' + "'", char1 == '\233');
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 1, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '0', (int) 'W');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g" + "'", str2, "g");
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(1, (int) '\317');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'x', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3O" + "'", str2, "3O");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\317', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "27" + "'", str2, "27");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) 'm');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\244' + "'", char1 == '\244');
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\244', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "164" + "'", str2, "164");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'A', (int) '\322');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x" + "'", str2, "x");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\233', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "155" + "'", str2, "155");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\237', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1u" + "'", str2, "1u");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\233', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\326');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u010d' + "'", char1 == '\u010d');
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '6', (int) 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\244', (int) '\u0154');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\333" + "'", str2, "\333");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\317', (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal(1);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '1' + "'", char1 == '1');
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u010d', (int) '\u010d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\244');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\333' + "'", char1 == '\333');
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\237', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1r" + "'", str2, "1r");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\236', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u0154', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "340" + "'", str2, "340");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) -1, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\244', (int) '\u011d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\333" + "'", str2, "\333");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) -1, (int) '\236');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\u0154');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u018b' + "'", char1 == '\u018b');
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '1', (int) '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '#', (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(0, (int) 'g');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((-1), (int) '\u011d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\u018b');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u01c2' + "'", char1 == '\u01c2');
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '6', (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'W', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "87" + "'", str2, "87");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'm', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '6', (int) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m" + "'", str2, "m");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'k', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(0, (int) '\333');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\233', (int) '\326');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\322" + "'", str2, "\322");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\236', (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(0, 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) 'k');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\242' + "'", char1 == '\242');
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\237', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'h', (int) '\346');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\237" + "'", str2, "\237");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 10, (int) '\237');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\242', (int) 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1q" + "'", str2, "1q");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u0154', (int) '\237');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2M" + "'", str2, "2M");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 10, (int) '\u018b');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\333', (int) '\346');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\u0112" + "'", str2, "\u0112");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\237', (int) '\u01c2');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\326" + "'", str2, "\326");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 0, (int) '6');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 10, (int) '\u0154');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(0, (int) 'W');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'g', (int) '1');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "25" + "'", str2, "25");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\236');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\325' + "'", char1 == '\325');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 1, (int) 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(1, 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(1, (int) '\244');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(10, (int) '\326');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\257', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\202" + "'", str2, "1\202");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) -1, (int) '\u011d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u011d', (int) 'k');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2~" + "'", str2, "2~");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'a', (int) '\u0154');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\230" + "'", str2, "\230");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((-1), (int) '0');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'k', (int) 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "13" + "'", str2, "13");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u018b', (int) '\322');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\360" + "'", str2, "1\360");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\317');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u0106' + "'", char1 == '\u0106');
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 0, (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\221');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\310' + "'", char1 == '\310');
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\233', (int) 'g');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1k" + "'", str2, "1k");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'x', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) 'W');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\216' + "'", char1 == '\216');
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\236', (int) '\233');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "13" + "'", str2, "13");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\333');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u0112' + "'", char1 == '\u0112');
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u018b', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\230', (int) '\322');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\317" + "'", str2, "\317");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u0154', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "3_" + "'", str2, "3_");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u011d', (int) '\216');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "21" + "'", str2, "21");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\216', (int) '\u011d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\305" + "'", str2, "\305");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 0, (int) '\237');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 100, (int) '\233');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\233" + "'", str2, "\233");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\u010d');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u0144' + "'", char1 == '\u0144');
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal(10);
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + 'A' + "'", char1 == 'A');
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 1, (int) '\u010d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u0154', (int) '\u0106');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\205" + "'", str2, "1\205");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '4', (int) '\u0112');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k" + "'", str2, "k");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\310', (int) 'm');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1\222" + "'", str2, "1\222");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'A', (int) '\u011d');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x" + "'", str2, "x");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\325', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\236', (int) 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1m" + "'", str2, "1m");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) 0, (int) '\317');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\242', (int) '\244');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\331" + "'", str2, "\331");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\325');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u010c' + "'", char1 == '\u010c');
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\221', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "145" + "'", str2, "145");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u0112', (int) '\317');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1z" + "'", str2, "1z");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\233', (int) 'h');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1j" + "'", str2, "1j");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\216', (int) '\346');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\305" + "'", str2, "\305");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (byte) -1, (int) '\233');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\u010c', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase(100, (int) 'W');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1D" + "'", str2, "1D");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\230', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1n" + "'", str2, "1n");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'k', (int) '\221');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\242" + "'", str2, "\242");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\216');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\305' + "'", char1 == '\305');
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 0, (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '#', (int) '\322');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Z" + "'", str2, "Z");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\242');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\331' + "'", char1 == '\331');
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '6', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\331', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "6P" + "'", str2, "6P");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((-1), (int) 'Z');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) 'g', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\221', (int) 'x');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1P" + "'", str2, "1P");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\257', (int) '\331');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\346" + "'", str2, "\346");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        char char1 = com.thealgorithms.conversions.DecimalToAnyBase.reVal((int) '\331');
        org.junit.Assert.assertTrue("'" + char1 + "' != '" + '\u0110' + "'", char1 == '\u0110');
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\317', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.lang.String str2 = com.thealgorithms.conversions.DecimalToAnyBase.convertToAnyBase((int) '\230', (int) '\331');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\317" + "'", str2, "\317");
    }
}

