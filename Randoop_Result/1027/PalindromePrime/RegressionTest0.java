package PalindromePrime;

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
        com.thealgorithms.misc.PalindromePrime.functioning(100);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.thealgorithms.misc.PalindromePrime palindromePrime0 = new com.thealgorithms.misc.PalindromePrime();
        java.lang.Class<?> wildcardClass1 = palindromePrime0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.thealgorithms.misc.PalindromePrime.functioning(1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (byte) 0);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 79 + "'", int1 == 79);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.thealgorithms.misc.PalindromePrime.functioning(53);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (byte) 10);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.thealgorithms.misc.PalindromePrime.functioning((int) '#');
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.thealgorithms.misc.PalindromePrime.functioning(10);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (short) 1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.thealgorithms.misc.PalindromePrime.functioning((-1));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (byte) 1);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(79);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (byte) -1);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        com.thealgorithms.misc.PalindromePrime.functioning(0);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (short) 100);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        com.thealgorithms.misc.PalindromePrime.functioning(97);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        com.thealgorithms.misc.PalindromePrime.functioning((int) 'a');
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        com.thealgorithms.misc.PalindromePrime.functioning((int) '4');
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 79 + "'", int1 == 79);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (short) 10);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (short) 0);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(79);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(53);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(25);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        com.thealgorithms.misc.PalindromePrime.functioning((int) ' ');
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(23);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(32);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(25);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 23 + "'", int1 == 23);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        com.thealgorithms.misc.PalindromePrime.functioning(23);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        com.thealgorithms.misc.PalindromePrime.functioning(52);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(52);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (byte) 100);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        com.thealgorithms.misc.PalindromePrime.functioning(79);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(53);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        com.thealgorithms.misc.PalindromePrime.functioning(32);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(35);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        boolean boolean1 = com.thealgorithms.misc.PalindromePrime.prime(23);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        com.thealgorithms.misc.PalindromePrime.functioning((int) (short) -1);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse(35);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        com.thealgorithms.misc.PalindromePrime.functioning(25);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        com.thealgorithms.misc.PalindromePrime.functioning(35);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        int int1 = com.thealgorithms.misc.PalindromePrime.reverse((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }
}

