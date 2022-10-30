package OctalToHexadecimal;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        com.thealgorithms.conversions.OctalToHexadecimal octalToHexadecimal0 = new com.thealgorithms.conversions.OctalToHexadecimal();
        java.lang.Class<?> wildcardClass1 = octalToHexadecimal0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) '4');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34" + "'", str1, "34");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("34");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 28 + "'", int1 == 28);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(28);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1C" + "'", str1, "1C");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("1C");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) ' ');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "20" + "'", str1, "20");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((-1));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) 'a');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "61" + "'", str1, "61");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("61");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("20");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(17);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11" + "'", str1, "11");
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69561 + "'", int1 == 69561);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(49);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "31" + "'", str1, "31");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(69561);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10FB9" + "'", str1, "10FB9");
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("64");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(52);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "34" + "'", str1, "34");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("11");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(16);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "9" + "'", str1, "9");
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) '#');
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "23" + "'", str1, "23");
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("9");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("31");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "64" + "'", str1, "64");
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("10FB9");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5657 + "'", int1 == 5657);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(8);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "8" + "'", str1, "8");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("8");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(27);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1B" + "'", str1, "1B");
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("23");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("1B");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 26 + "'", int1 == 26);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(5657);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1619" + "'", str1, "1619");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("1619");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 913 + "'", int1 == 913);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(19);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "13" + "'", str1, "13");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(25);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "19" + "'", str1, "19");
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(913);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "391" + "'", str1, "391");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("391");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 265 + "'", int1 == 265);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("13");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("19");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(26);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1A" + "'", str1, "1A");
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(11);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "B" + "'", str1, "B");
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("B");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("1A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(265);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "109" + "'", str1, "109");
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(18);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "12" + "'", str1, "12");
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("109");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 73 + "'", int1 == 73);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(73);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "49" + "'", str1, "49");
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("12");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("49");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.lang.String str1 = com.thealgorithms.conversions.OctalToHexadecimal.decimalToHex(41);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "29" + "'", str1, "29");
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        int int1 = com.thealgorithms.conversions.OctalToHexadecimal.octToDec("29");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }
}

