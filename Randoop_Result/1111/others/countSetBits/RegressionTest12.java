package others.countSetBits;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) -1);
        long long22 = countSetBits0.countsetBits((long) '#');
        long long24 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(3L);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits(3L);
        long long22 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits((long) '4');
        long long22 = countSetBits0.countsetBits((long) '4');
        long long24 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits(1L);
        long long22 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((-1L));
        long long20 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        long long22 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((long) (byte) 0);
        long long22 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        long long22 = countSetBits0.countsetBits((long) (-1));
        long long24 = countSetBits0.countsetBits(2L);
        long long26 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 1);
        long long4 = countSetBits0.countsetBits((long) (byte) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits(2L);
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        long long22 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((-1L));
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(100L);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits((long) 1);
        long long22 = countSetBits0.countsetBits((long) (short) 10);
        long long24 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }
}

