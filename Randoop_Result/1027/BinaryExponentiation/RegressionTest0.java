package BinaryExponentiation;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 'a', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (-1), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1125899906842624L + "'", long2 == 1125899906842624L);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.thealgorithms.divideandconquer.BinaryExponentiation binaryExponentiation0 = new com.thealgorithms.divideandconquer.BinaryExponentiation();
        java.lang.Class<?> wildcardClass1 = binaryExponentiation0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '4', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1125899906842624L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 100, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '4', (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 100, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (-1), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '#', 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '#', 1125899906842624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3553340105995321345L + "'", long2 == 3553340105995321345L);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(32L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(35L, 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1471355796980760577L + "'", long2 == 1471355796980760577L);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 10, 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 100, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (-1), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 0, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '#', 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8407224849895527163L + "'", long2 == 8407224849895527163L);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 1, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7766279631452241920L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3553340105995321345L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1471355796980760577L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5124825700716511231L) + "'", long2 == (-5124825700716511231L));
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1125899906842624L, 1471355796980760577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(35L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8407224849895527163L + "'", long2 == 8407224849895527163L);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '4', (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) -1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (-1), 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 100, 3553340105995321345L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 1, 1471355796980760577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10000000000L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 'a', (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-44563605345380415L) + "'", long2 == (-44563605345380415L));
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7766279631452241920L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-44563605345380415L), 8407224849895527163L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6384401023530665663L) + "'", long2 == (-6384401023530665663L));
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-44563605345380415L), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10000000000L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7766279631452241920L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-5124825700716511231L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5124825700716511231L) + "'", long2 == (-5124825700716511231L));
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-5124825700716511231L), (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 100, 1471355796980760577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, (-6384401023530665663L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '4', (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (-1), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10000000000L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 0, 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(100L, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1L), 1471355796980760577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 1471355796980760577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(35L, (-44563605345380415L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, 1471355796980760577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 100, 8407224849895527163L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '#', (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7766279631452241920L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 100, 1125899906842624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 100, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1125899906842624L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) -1, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 100, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1471355796980760577L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5124825700716511231L) + "'", long2 == (-5124825700716511231L));
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1471355796980760577L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4724054285048872959L) + "'", long2 == (-4724054285048872959L));
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6384401023530665663L), (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4526737940104672127L) + "'", long2 == (-4526737940104672127L));
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 'a', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1683002521388203393L + "'", long2 == 1683002521388203393L);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '#', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8170176069297290577L + "'", long2 == 8170176069297290577L);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 100, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6384401023530665663L), 3553340105995321345L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5433044398689515841L + "'", long2 == 5433044398689515841L);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(32L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, (-44563605345380415L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 100, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3553340105995321345L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3553340105995321345L + "'", long2 == 3553340105995321345L);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1L), 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 1, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '#', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6384401023530665663L), (-5124825700716511231L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10000000000L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10000000000L, 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 0, 1125899906842624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 100, 1683002521388203393L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5433044398689515841L, 1683002521388203393L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7488484550951917889L + "'", long2 == 7488484550951917889L);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(100L, (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '#', (-4526737940104672127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4724054285048872959L), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(32L, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10000000000L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, (-4724054285048872959L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8170176069297290577L, (-4724054285048872959L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(32L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, 8170176069297290577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6384401023530665663L), (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3805508975508734719L) + "'", long2 == (-3805508975508734719L));
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '4', 1125899906842624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1L), (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8814407033341083648L) + "'", long2 == (-8814407033341083648L));
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 0, (-44563605345380415L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 1, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (-1), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 0, 5433044398689515841L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7488484550951917889L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8279363752652620543L) + "'", long2 == (-8279363752652620543L));
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, 8170176069297290577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3805508975508734719L), 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6649435931019812865L + "'", long2 == 6649435931019812865L);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(100L, (-44563605345380415L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4724054285048872959L), 6649435931019812865L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7836269226468835327L) + "'", long2 == (-7836269226468835327L));
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4526737940104672127L), (-4724054285048872959L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1683002521388203393L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5433044398689515841L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8613117001039758273L + "'", long2 == 8613117001039758273L);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3136633892082024448L + "'", long2 == 3136633892082024448L);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(35L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8170176069297290577L + "'", long2 == 8170176069297290577L);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', 3136633892082024448L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1683002521388203393L, 8170176069297290577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3799822165461890433L + "'", long2 == 3799822165461890433L);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7766279631452241920L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4526737940104672127L), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3950789237464402559L) + "'", long2 == (-3950789237464402559L));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 'a', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (-6384401023530665663L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8613117001039758273L, (-8279363752652620543L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1125899906842624L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3136633892082024448L + "'", long2 == 3136633892082024448L);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3553340105995321345L, (-6384401023530665663L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', (-4724054285048872959L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6649435931019812865L, (-4724054285048872959L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 3799822165461890433L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) -1, 1683002521388203393L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1683002521388203393L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1232170233353492735L) + "'", long2 == (-1232170233353492735L));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3805508975508734719L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6649435931019812865L + "'", long2 == 6649435931019812865L);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3950789237464402559L), 6649435931019812865L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2949439369029651071L) + "'", long2 == (-2949439369029651071L));
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3136633892082024448L + "'", long2 == 3136633892082024448L);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(32L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3950789237464402559L), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3950789237464402559L) + "'", long2 == (-3950789237464402559L));
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6384401023530665663L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3950789237464402559L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7836269226468835327L), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6808855152166961153L + "'", long2 == 6808855152166961153L);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, 7488484550951917889L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4724054285048872959L), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4724054285048872959L) + "'", long2 == (-4724054285048872959L));
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8170176069297290577L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 0, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4724054285048872959L), 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1942031791451799553L + "'", long2 == 1942031791451799553L);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1125899906842624L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 'a', 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4636493654939140095L) + "'", long2 == (-4636493654939140095L));
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 100, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7836269226468835327L), 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6467110316462309377L + "'", long2 == 6467110316462309377L);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6649435931019812865L, 6467110316462309377L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1206811592086757377L + "'", long2 == 1206811592086757377L);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(32L, 6808855152166961153L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(35L, (-8279363752652620543L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3950789237464402559L), (-3950789237464402559L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 6649435931019812865L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, 3799822165461890433L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8613117001039758273L, 8407224849895527163L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5315697100476570945L + "'", long2 == 5315697100476570945L);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 100, (-6384401023530665663L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2949439369029651071L), (-4636493654939140095L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 6467110316462309377L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7766279631452241920L, (-8814407033341083648L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 'a', (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1683002521388203393L + "'", long2 == 1683002521388203393L);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6384401023530665663L), (-7836269226468835327L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(100L, 1683002521388203393L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3136633892082024448L, (-8279363752652620543L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8814407033341083648L), 3136633892082024448L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 100, (-8279363752652620543L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 'a', 5315697100476570945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8201224553304782945L + "'", long2 == 8201224553304782945L);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (-1), 8201224553304782945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6649435931019812865L, (-3950789237464402559L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '#', (-2949439369029651071L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1683002521388203393L, (-3805508975508734719L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3136633892082024448L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '4', (-3950789237464402559L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', 1942031791451799553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 10, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8814407033341083648L) + "'", long2 == (-8814407033341083648L));
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6384401023530665663L), 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 913000537610256385L + "'", long2 == 913000537610256385L);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8814407033341083648L), 6808855152166961153L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4724054285048872959L), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4724054285048872959L) + "'", long2 == (-4724054285048872959L));
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8170176069297290577L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8279363752652620543L), 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2656027501434503167L) + "'", long2 == (-2656027501434503167L));
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6808855152166961153L, 6467110316462309377L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3999783953522229247L) + "'", long2 == (-3999783953522229247L));
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 100, 1206811592086757377L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4636493654939140095L), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1942031791451799553L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1942031791451799553L + "'", long2 == 1942031791451799553L);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4636493654939140095L), (-3805508975508734719L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1206811592086757377L, (-4526737940104672127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, 1942031791451799553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7836269226468835327L), 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4785220151932878847L) + "'", long2 == (-4785220151932878847L));
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-44563605345380415L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) -1, 1206811592086757377L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (-4526737940104672127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8201224553304782945L, 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6210356235417583615L) + "'", long2 == (-6210356235417583615L));
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8814407033341083648L), (-44563605345380415L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-5124825700716511231L), 5315697100476570945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1825181011697205249L + "'", long2 == 1825181011697205249L);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4636493654939140095L), 1825181011697205249L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4617840629353807873L + "'", long2 == 4617840629353807873L);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (-1), (-2949439369029651071L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5433044398689515841L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-5124825700716511231L), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7445391125092761599L) + "'", long2 == (-7445391125092761599L));
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2656027501434503167L), 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2656027501434503167L) + "'", long2 == (-2656027501434503167L));
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 10, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7445391125092761599L), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2574812350687215617L + "'", long2 == 2574812350687215617L);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', (-3999783953522229247L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, 3553340105995321345L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-44563605345380415L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8279363752652620543L), 1471355796980760577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7817165885522918657L + "'", long2 == 7817165885522918657L);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, 1471355796980760577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (-4636493654939140095L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 1, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3805508975508734719L), (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3739962178180455423L) + "'", long2 == (-3739962178180455423L));
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3739962178180455423L), 1125899906842624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8070450532247928831L) + "'", long2 == (-8070450532247928831L));
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2656027501434503167L), (-4724054285048872959L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 10, (-6384401023530665663L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1825181011697205249L, 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8801164708569677823L) + "'", long2 == (-8801164708569677823L));
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3739962178180455423L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8814407033341083648L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8070450532247928831L), 913000537610256385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8070450532247928831L) + "'", long2 == (-8070450532247928831L));
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 1825181011697205249L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (-1), 7817165885522918657L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 7766279631452241920L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, 1683002521388203393L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4724054285048872959L), 35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1165185446431424513L + "'", long2 == 1165185446431424513L);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, (-1232170233353492735L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-44563605345380415L), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4785220151932878847L), 8613117001039758273L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4237627352294621185L + "'", long2 == 4237627352294621185L);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3553340105995321345L, 913000537610256385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3553340105995321345L + "'", long2 == 3553340105995321345L);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6808855152166961153L, (-3999783953522229247L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2656027501434503167L), 3553340105995321345L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2656027501434503167L) + "'", long2 == (-2656027501434503167L));
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7817165885522918657L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1848263808979446783L) + "'", long2 == (-1848263808979446783L));
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10000000000L, 4237627352294621185L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 100, (-5124825700716511231L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, (-3950789237464402559L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 10, 7488484550951917889L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (-4785220151932878847L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3799822165461890433L, (-4724054285048872959L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1942031791451799553L, (-4785220151932878847L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2656027501434503167L), (-8814407033341083648L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8070450532247928831L), 3136633892082024448L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8201224553304782945L, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7817165885522918657L, (-1848263808979446783L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', (-8801164708569677823L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(2574812350687215617L, 7817165885522918657L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4023674891743002625L + "'", long2 == 4023674891743002625L);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, (-7836269226468835327L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, (-7445391125092761599L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7445391125092761599L), (-8801164708569677823L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3553340105995321345L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(4237627352294621185L, 7817165885522918657L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6873562168986435583L) + "'", long2 == (-6873562168986435583L));
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5433044398689515841L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6742681841529399297L + "'", long2 == 6742681841529399297L);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8801164708569677823L), (-6384401023530665663L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) -1, (-7836269226468835327L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6649435931019812865L, 8201224553304782945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4026442783265677311L) + "'", long2 == (-4026442783265677311L));
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(4617840629353807873L, 4023674891743002625L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-181870673516298239L) + "'", long2 == (-181870673516298239L));
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(4023674891743002625L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3136633892082024448L, 1125899906842624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '4', (-8070450532247928831L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-44563605345380415L), 1471355796980760577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5600855835657218111L) + "'", long2 == (-5600855835657218111L));
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(913000537610256385L, 6467110316462309377L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-582194538676748287L) + "'", long2 == (-582194538676748287L));
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 7488484550951917889L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6467110316462309377L, 1942031791451799553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6467110316462309377L + "'", long2 == 6467110316462309377L);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1848263808979446783L), 7817165885522918657L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9056108840108043263L) + "'", long2 == (-9056108840108043263L));
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3136633892082024448L, 6742681841529399297L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) -1, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4724054285048872959L), 1683002521388203393L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3610725010089443329L + "'", long2 == 3610725010089443329L);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3553340105995321345L, (-8070450532247928831L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6649435931019812865L, (-582194538676748287L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (-4724054285048872959L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 100, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4785220151932878847L), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1093330723160457217L + "'", long2 == 1093330723160457217L);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2949439369029651071L), 4237627352294621185L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5996705059085257343L) + "'", long2 == (-5996705059085257343L));
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-181870673516298239L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(35L, 6649435931019812865L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2010045766700007389L) + "'", long2 == (-2010045766700007389L));
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3950789237464402559L), 4237627352294621185L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6404657563534587265L + "'", long2 == 6404657563534587265L);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1125899906842624L, 5315697100476570945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2949439369029651071L), (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5805130070847874561L + "'", long2 == 5805130070847874561L);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10000000000L + "'", long2 == 10000000000L);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6873562168986435583L), (-5996705059085257343L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7488484550951917889L, (-8814407033341083648L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (-44563605345380415L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, 8613117001039758273L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, (-3999783953522229247L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6384401023530665663L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2480690195325376511L) + "'", long2 == (-2480690195325376511L));
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7488484550951917889L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7488484550951917889L + "'", long2 == 7488484550951917889L);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (-2480690195325376511L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8801164708569677823L), (-3999783953522229247L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8201224553304782945L, 8170176069297290577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3923893640274089569L + "'", long2 == 3923893640274089569L);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6742681841529399297L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3799822165461890433L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3799822165461890433L + "'", long2 == 3799822165461890433L);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 100, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8170176069297290577L, 4023674891743002625L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4441858090134094511L) + "'", long2 == (-4441858090134094511L));
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2480690195325376511L), (-2010045766700007389L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4026442783265677311L), (-7836269226468835327L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7445391125092761599L), 1206811592086757377L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7255923076007723009L + "'", long2 == 7255923076007723009L);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2656027501434503167L), (-2949439369029651071L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6742681841529399297L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5752477367060998145L + "'", long2 == 5752477367060998145L);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1471355796980760577L, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4724054285048872959L) + "'", long2 == (-4724054285048872959L));
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 100, (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 7255923076007723009L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7766279631452241920L, (-3950789237464402559L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1165185446431424513L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 0, (-6384401023530665663L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3553340105995321345L, 5315697100476570945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7687644563921436671L) + "'", long2 == (-7687644563921436671L));
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-5600855835657218111L), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5600855835657218111L) + "'", long2 == (-5600855835657218111L));
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4526737940104672127L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4026442783265677311L), 6808855152166961153L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8981347953373110271L) + "'", long2 == (-8981347953373110271L));
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, 1942031791451799553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2010045766700007389L), (-5996705059085257343L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1L), 6404657563534587265L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5433044398689515841L, (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5433044398689515841L + "'", long2 == 5433044398689515841L);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5433044398689515841L, (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2652587470901887743L) + "'", long2 == (-2652587470901887743L));
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1848263808979446783L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8245945780146634751L) + "'", long2 == (-8245945780146634751L));
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1125899906842624L, (-5600855835657218111L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7255923076007723009L, (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6625687790443036673L + "'", long2 == 6625687790443036673L);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1848263808979446783L), 1683002521388203393L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-799077207765953535L) + "'", long2 == (-799077207765953535L));
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-44563605345380415L), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3375002220609613633L + "'", long2 == 3375002220609613633L);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3375002220609613633L, (-4526737940104672127L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3805508975508734719L), 1165185446431424513L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-887082305649263359L) + "'", long2 == (-887082305649263359L));
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, (-3999783953522229247L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3950789237464402559L), 4023674891743002625L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 476389182109873537L + "'", long2 == 476389182109873537L);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-5600855835657218111L), (-8801164708569677823L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, (-3805508975508734719L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 0, 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 100, (-2010045766700007389L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-9056108840108043263L), (-9056108840108043263L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 1, 1093330723160457217L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1093330723160457217L, 1125899906842624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(32L, 6467110316462309377L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7836269226468835327L), (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2918126938990051329L + "'", long2 == 2918126938990051329L);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 10, (-8245945780146634751L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, (-799077207765953535L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3923893640274089569L, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8245945780146634751L), (-3950789237464402559L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1825181011697205249L, (-582194538676748287L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5315697100476570945L, 1165185446431424513L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4983870770455960897L + "'", long2 == 4983870770455960897L);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(0L, 1165185446431424513L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3999783953522229247L), (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7255923076007723009L, 476389182109873537L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7643715941599019009L + "'", long2 == 7643715941599019009L);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7643715941599019009L, (-6210356235417583615L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1L, 3136633892082024448L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4526737940104672127L), (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-799077207765953535L), 6649435931019812865L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5463557916864818175L) + "'", long2 == (-5463557916864818175L));
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7766279631452241920L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, 6467110316462309377L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1471355796980760577L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6606046797720715265L + "'", long2 == 6606046797720715265L);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 1, (-2480690195325376511L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3999783953522229247L), (-8981347953373110271L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10000000000L, 8613117001039758273L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6467110316462309377L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, 1125899906842624L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(100L, 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7766279631452241920L + "'", long2 == 7766279631452241920L);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-799077207765953535L), 3799822165461890433L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4054347638742592511L) + "'", long2 == (-4054347638742592511L));
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(32L, 913000537610256385L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 100, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7643715941599019009L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5433044398689515841L, (-1232170233353492735L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2010045766700007389L), (-2949439369029651071L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6467110316462309377L, 6742681841529399297L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3775398649282953217L + "'", long2 == 3775398649282953217L);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7836269226468835327L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4526737940104672127L), 3775398649282953217L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2512772591149059201L + "'", long2 == 2512772591149059201L);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6649435931019812865L, (-4785220151932878847L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-5463557916864818175L), 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(4023674891743002625L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7687644563921436671L), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7687644563921436671L) + "'", long2 == (-7687644563921436671L));
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8170176069297290577L, (-2652587470901887743L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3739962178180455423L), (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1482257710309971967L) + "'", long2 == (-1482257710309971967L));
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3775398649282953217L, 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3775398649282953217L + "'", long2 == 3775398649282953217L);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 10, (-3950789237464402559L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8070450532247928831L), (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6917529027641081855L) + "'", long2 == (-6917529027641081855L));
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(100L, (-2656027501434503167L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3775398649282953217L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(476389182109873537L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8694628427746760449L + "'", long2 == 8694628427746760449L);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3923893640274089569L, (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 8312174487570496289L + "'", long2 == 8312174487570496289L);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4026442783265677311L), 1942031791451799553L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8627995702531481599L) + "'", long2 == (-8627995702531481599L));
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) ' ', (-9056108840108043263L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-5463557916864818175L), (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1471355796980760577L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1087442308174970881L + "'", long2 == 1087442308174970881L);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(4023674891743002625L, 1165185446431424513L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 119054014812782593L + "'", long2 == 119054014812782593L);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6625687790443036673L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2583520149281701887L) + "'", long2 == (-2583520149281701887L));
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3775398649282953217L, 3775398649282953217L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-6528837298140741631L) + "'", long2 == (-6528837298140741631L));
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(4023674891743002625L, (-3739962178180455423L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8170176069297290577L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 7619652049121597761L + "'", long2 == 7619652049121597761L);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4054347638742592511L), 7488484550951917889L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3907929062924430335L) + "'", long2 == (-3907929062924430335L));
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-181870673516298239L), 3553340105995321345L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-181870673516298239L) + "'", long2 == (-181870673516298239L));
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1165185446431424513L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4636493654939140095L), (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6528837298140741631L), (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8694628427746760449L, 1683002521388203393L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5459270072448952575L) + "'", long2 == (-5459270072448952575L));
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1087442308174970881L, (-8627995702531481599L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1206811592086757377L, (-2583520149281701887L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(476389182109873537L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6528837298140741631L), (-3999783953522229247L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10000000000L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-1848263808979446783L), 1087442308174970881L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4965426715933158399L) + "'", long2 == (-4965426715933158399L));
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3907929062924430335L), 6606046797720715265L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1829982021434659841L + "'", long2 == 1829982021434659841L);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8694628427746760449L, (-799077207765953535L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-3739962178180455423L), 8312174487570496289L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3729249388044805121L + "'", long2 == 3729249388044805121L);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7687644563921436671L), (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7831759751997292543L) + "'", long2 == (-7831759751997292543L));
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3553340105995321345L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-5814147118935310335L) + "'", long2 == (-5814147118935310335L));
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-6528837298140741631L), (-7836269226468835327L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-5124825700716511231L), 5433044398689515841L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3388837368466243585L + "'", long2 == 3388837368466243585L);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2010045766700007389L), 2918126938990051329L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6338438056652144675L + "'", long2 == 6338438056652144675L);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2480690195325376511L), 7817165885522918657L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2304488572173821953L + "'", long2 == 2304488572173821953L);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(4983870770455960897L, 4983870770455960897L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5547340739690392897L + "'", long2 == 5547340739690392897L);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6649435931019812865L, (-7445391125092761599L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(2918126938990051329L, 7255923076007723009L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3334709904521822209L + "'", long2 == 3334709904521822209L);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 0, (-8814407033341083648L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7817165885522918657L, 2512772591149059201L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-9029617890929689343L) + "'", long2 == (-9029617890929689343L));
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5805130070847874561L, (-799077207765953535L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(476389182109873537L, 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-3152775276927949311L) + "'", long2 == (-3152775276927949311L));
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8279363752652620543L), (-8801164708569677823L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7643715941599019009L, (-3950789237464402559L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4785220151932878847L), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-4785220151932878847L) + "'", long2 == (-4785220151932878847L));
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-181870673516298239L), 5547340739690392897L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2756743543077732353L + "'", long2 == 2756743543077732353L);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-2949439369029651071L), 6625687790443036673L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 329588326890698113L + "'", long2 == 329588326890698113L);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5315697100476570945L, 5433044398689515841L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1248740029451169089L + "'", long2 == 1248740029451169089L);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(6742681841529399297L, 3136633892082024448L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-8256153648132784127L) + "'", long2 == (-8256153648132784127L));
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8981347953373110271L), 10000000000L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-7589642004011679743L) + "'", long2 == (-7589642004011679743L));
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (short) 100, 8170176069297290577L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(7817165885522918657L, 6606046797720715265L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3877258161805409537L + "'", long2 == 3877258161805409537L);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) '4', (-6917529027641081855L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(5315697100476570945L, 119054014812782593L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 5746311996894797121L + "'", long2 == 5746311996894797121L);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8694628427746760449L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(10L, (-8801164708569677823L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(2756743543077732353L, (-7831759751997292543L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(1087442308174970881L, (-9029617890929689343L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(100L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-4965426715933158399L), 1248740029451169089L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 662558947563721729L + "'", long2 == 662558947563721729L);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) -1, 6404657563534587265L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8201224553304782945L, 8201224553304782945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2439238690643223455L) + "'", long2 == (-2439238690643223455L));
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7687644563921436671L), 3136633892082024448L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3799822165461890433L, (-582194538676748287L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3136633892082024448L, (-6873562168986435583L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(2304488572173821953L, (-3152775276927949311L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((long) (byte) 0, 5315697100476570945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(4983870770455960897L, (-9029617890929689343L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-799077207765953535L), 5315697100476570945L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-2112682734366698495L) + "'", long2 == (-2112682734366698495L));
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8627995702531481599L), (-7831759751997292543L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(3388837368466243585L, 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-7831759751997292543L), (-8627995702531481599L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower((-8245945780146634751L), (-5124825700716511231L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        long long2 = com.thealgorithms.divideandconquer.BinaryExponentiation.calculatePower(8613117001039758273L, (-582194538676748287L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }
}

