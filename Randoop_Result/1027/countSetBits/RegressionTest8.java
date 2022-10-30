package countSetBits;

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
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits(3L);
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) ' ');
        long long22 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits(3L);
        long long10 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((long) 10);
        long long20 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 1);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 'a');
        long long20 = countSetBits0.countsetBits((long) '#');
        long long22 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        long long24 = countSetBits0.countsetBits((long) (byte) 100);
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
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) (short) 1);
        long long24 = countSetBits0.countsetBits((long) (byte) 10);
        long long26 = countSetBits0.countsetBits((long) 10);
        long long28 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass29 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        long long22 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) '#');
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        long long22 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) (-1));
        long long22 = countSetBits0.countsetBits((long) 'a');
        long long24 = countSetBits0.countsetBits((long) ' ');
        long long26 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits(100L);
        long long22 = countSetBits0.countsetBits((long) (short) 0);
        long long24 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) '#');
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) 10);
        long long24 = countSetBits0.countsetBits((long) (short) 0);
        long long26 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) (short) 0);
        long long18 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        long long20 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        long long20 = countSetBits0.countsetBits((long) (byte) -1);
        long long22 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(3L);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (byte) 100);
        long long10 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
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
        long long20 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) 'a');
        long long22 = countSetBits0.countsetBits((long) 'a');
        long long24 = countSetBits0.countsetBits(0L);
        long long26 = countSetBits0.countsetBits((long) (-1));
        long long28 = countSetBits0.countsetBits((long) '#');
        long long30 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        long long24 = countSetBits0.countsetBits((long) (byte) 10);
        long long26 = countSetBits0.countsetBits(3L);
        long long28 = countSetBits0.countsetBits((long) (-1));
        long long30 = countSetBits0.countsetBits((long) (short) 100);
        long long32 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3L + "'", long30 == 3L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 3L + "'", long32 == 3L);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits(10L);
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        long long24 = countSetBits0.countsetBits(10L);
        long long26 = countSetBits0.countsetBits((long) '#');
        long long28 = countSetBits0.countsetBits((long) ' ');
        long long30 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        long long22 = countSetBits0.countsetBits((long) '#');
        long long24 = countSetBits0.countsetBits((long) '4');
        long long26 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) 0);
        long long22 = countSetBits0.countsetBits((long) 0);
        long long24 = countSetBits0.countsetBits(0L);
        long long26 = countSetBits0.countsetBits((long) 1);
        long long28 = countSetBits0.countsetBits((long) (short) 0);
        long long30 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((-1L));
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits((long) '#');
        long long20 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        long long20 = countSetBits0.countsetBits((long) (-1));
        long long22 = countSetBits0.countsetBits((long) ' ');
        long long24 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) '#');
        long long20 = countSetBits0.countsetBits((long) 'a');
        long long22 = countSetBits0.countsetBits((long) 100);
        long long24 = countSetBits0.countsetBits((long) (short) 1);
        long long26 = countSetBits0.countsetBits((-1L));
        long long28 = countSetBits0.countsetBits(3L);
        long long30 = countSetBits0.countsetBits(0L);
        long long32 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass33 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 2L + "'", long32 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        long long20 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) '#');
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) (-1));
        long long20 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        long long22 = countSetBits0.countsetBits((long) '#');
        long long24 = countSetBits0.countsetBits((long) 0);
        long long26 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        long long24 = countSetBits0.countsetBits((long) (byte) 0);
        long long26 = countSetBits0.countsetBits((long) 'a');
        long long28 = countSetBits0.countsetBits((long) ' ');
        long long30 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
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
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits(3L);
        long long22 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        long long24 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        long long22 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits(1L);
        long long22 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits((-1L));
        long long22 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        long long22 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        long long20 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) 10);
        long long14 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 1);
        long long4 = countSetBits0.countsetBits((long) (byte) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        long long22 = countSetBits0.countsetBits((long) '#');
        long long24 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((long) 'a');
        long long20 = countSetBits0.countsetBits((long) ' ');
        long long22 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        long long20 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (-1));
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) 10);
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        long long22 = countSetBits0.countsetBits((long) '#');
        long long24 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) 10);
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) '#');
        long long20 = countSetBits0.countsetBits((long) 'a');
        long long22 = countSetBits0.countsetBits((long) 1);
        long long24 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) 0);
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        long long22 = countSetBits0.countsetBits(1L);
        long long24 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits(100L);
        long long20 = countSetBits0.countsetBits((long) 100);
        long long22 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits((long) (short) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) ' ');
        long long6 = countSetBits0.countsetBits((long) (byte) 0);
        long long8 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((-1L));
        long long22 = countSetBits0.countsetBits((long) (short) 1);
        long long24 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) 1);
        long long22 = countSetBits0.countsetBits((long) (byte) 100);
        long long24 = countSetBits0.countsetBits(3L);
        long long26 = countSetBits0.countsetBits((long) 'a');
        long long28 = countSetBits0.countsetBits(0L);
        long long30 = countSetBits0.countsetBits(0L);
        long long32 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass33 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((-1L));
        long long24 = countSetBits0.countsetBits(0L);
        long long26 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        long long22 = countSetBits0.countsetBits(3L);
        long long24 = countSetBits0.countsetBits((long) (byte) -1);
        long long26 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((-1L));
        long long20 = countSetBits0.countsetBits((long) 1);
        long long22 = countSetBits0.countsetBits(3L);
        long long24 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (byte) -1);
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        long long24 = countSetBits0.countsetBits((long) (-1));
        long long26 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 1);
        long long4 = countSetBits0.countsetBits((long) 'a');
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        long long8 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 0);
        long long20 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits((long) 'a');
        long long22 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        long long24 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        long long22 = countSetBits0.countsetBits(100L);
        long long24 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits((long) (short) 0);
        long long18 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) '#');
        long long20 = countSetBits0.countsetBits((long) 'a');
        long long22 = countSetBits0.countsetBits((long) 100);
        long long24 = countSetBits0.countsetBits((long) (short) 1);
        long long26 = countSetBits0.countsetBits((-1L));
        long long28 = countSetBits0.countsetBits(3L);
        long long30 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass31 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) 10);
        long long24 = countSetBits0.countsetBits((long) (short) 0);
        long long26 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) 10);
        long long20 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) 100);
        long long22 = countSetBits0.countsetBits((long) 10);
        long long24 = countSetBits0.countsetBits((long) 100);
        long long26 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((-1L));
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits(1L);
        long long22 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (-1));
        long long20 = countSetBits0.countsetBits((long) (-1));
        long long22 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits((long) (short) 0);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits(100L);
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits(3L);
        long long24 = countSetBits0.countsetBits((long) (short) 10);
        long long26 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits(100L);
        long long22 = countSetBits0.countsetBits(0L);
        long long24 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits((long) (byte) 10);
        long long24 = countSetBits0.countsetBits((long) ' ');
        long long26 = countSetBits0.countsetBits((long) '4');
        long long28 = countSetBits0.countsetBits((long) 'a');
        long long30 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass31 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3L + "'", long30 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits((long) (byte) 0);
        long long22 = countSetBits0.countsetBits(1L);
        long long24 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits((long) 1);
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        long long24 = countSetBits0.countsetBits((long) (byte) 100);
        long long26 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) (short) 1);
        long long24 = countSetBits0.countsetBits((long) (short) 1);
        long long26 = countSetBits0.countsetBits((long) (-1));
        long long28 = countSetBits0.countsetBits((long) 1);
        long long30 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits(100L);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) 'a');
        long long22 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) 0);
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        long long24 = countSetBits0.countsetBits((long) (-1));
        long long26 = countSetBits0.countsetBits((long) (short) -1);
        long long28 = countSetBits0.countsetBits((-1L));
        long long30 = countSetBits0.countsetBits((long) 10);
        long long32 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2L + "'", long30 == 2L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1L + "'", long32 == 1L);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        long long22 = countSetBits0.countsetBits((long) (byte) 0);
        long long24 = countSetBits0.countsetBits((long) (byte) -1);
        long long26 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) 'a');
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        long long22 = countSetBits0.countsetBits(3L);
        long long24 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits((long) 0);
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
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits((long) 'a');
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) 1);
        long long24 = countSetBits0.countsetBits((long) ' ');
        long long26 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        long long24 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits(2L);
        long long20 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) (short) 10);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '4');
        long long8 = countSetBits0.countsetBits(10L);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits(10L);
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        long long24 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits(10L);
        long long22 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        long long22 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits((-1L));
        long long22 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) 'a');
        long long20 = countSetBits0.countsetBits((long) 100);
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        long long24 = countSetBits0.countsetBits((-1L));
        long long26 = countSetBits0.countsetBits((long) (byte) -1);
        long long28 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass29 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits((long) '4');
        long long22 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits(3L);
        long long22 = countSetBits0.countsetBits(100L);
        long long24 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        long long22 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) '#');
        long long20 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        long long22 = countSetBits0.countsetBits((long) 0);
        long long24 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) (-1));
        long long24 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(3L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) 'a');
        long long20 = countSetBits0.countsetBits((long) 100);
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        long long24 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((long) ' ');
        long long22 = countSetBits0.countsetBits((long) (-1));
        long long24 = countSetBits0.countsetBits(0L);
        long long26 = countSetBits0.countsetBits((long) (short) -1);
        long long28 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) '#');
        long long20 = countSetBits0.countsetBits((long) (byte) 0);
        long long22 = countSetBits0.countsetBits((long) (byte) 0);
        long long24 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 10);
        long long10 = countSetBits0.countsetBits((-1L));
        long long12 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((-1L));
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits(100L);
        long long22 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 1);
        long long4 = countSetBits0.countsetBits((long) (byte) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 0);
        long long22 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        long long22 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        long long22 = countSetBits0.countsetBits(2L);
        long long24 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        long long20 = countSetBits0.countsetBits((long) 100);
        long long22 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits(100L);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        long long22 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) (-1));
        long long20 = countSetBits0.countsetBits((long) '4');
        long long22 = countSetBits0.countsetBits((long) 0);
        long long24 = countSetBits0.countsetBits(100L);
        long long26 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits(1L);
        long long22 = countSetBits0.countsetBits((long) (short) 1);
        long long24 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) 'a');
        long long22 = countSetBits0.countsetBits(0L);
        long long24 = countSetBits0.countsetBits(2L);
        long long26 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits((long) ' ');
        long long22 = countSetBits0.countsetBits(100L);
        long long24 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits(2L);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) 'a');
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        long long22 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits((long) ' ');
        long long22 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits(2L);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((-1L));
        long long20 = countSetBits0.countsetBits((-1L));
        long long22 = countSetBits0.countsetBits((long) '#');
        long long24 = countSetBits0.countsetBits(100L);
        long long26 = countSetBits0.countsetBits((long) (byte) 1);
        long long28 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits((long) (-1));
        long long20 = countSetBits0.countsetBits((long) (byte) 0);
        long long22 = countSetBits0.countsetBits((long) '4');
        long long24 = countSetBits0.countsetBits((long) 'a');
        long long26 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 1);
        long long4 = countSetBits0.countsetBits((long) 'a');
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((-1L));
        long long20 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits(100L);
        long long20 = countSetBits0.countsetBits((-1L));
        long long22 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        long long24 = countSetBits0.countsetBits(0L);
        long long26 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) '#');
        long long24 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((-1L));
        long long12 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (byte) 1);
        long long6 = countSetBits0.countsetBits((long) (short) 1);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) 'a');
        long long20 = countSetBits0.countsetBits((long) 100);
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        long long20 = countSetBits0.countsetBits((long) 1);
        long long22 = countSetBits0.countsetBits((long) (byte) 0);
        long long24 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits(10L);
        long long22 = countSetBits0.countsetBits((long) 'a');
        long long24 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) 0);
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        long long24 = countSetBits0.countsetBits((long) (-1));
        long long26 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits((-1L));
        long long20 = countSetBits0.countsetBits(1L);
        long long22 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) '#');
        long long20 = countSetBits0.countsetBits((long) 'a');
        long long22 = countSetBits0.countsetBits((long) 100);
        long long24 = countSetBits0.countsetBits((long) '#');
        long long26 = countSetBits0.countsetBits((long) '4');
        long long28 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass29 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits(2L);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        long long22 = countSetBits0.countsetBits((long) 0);
        long long24 = countSetBits0.countsetBits((long) (short) 0);
        long long26 = countSetBits0.countsetBits(0L);
        long long28 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits(100L);
        long long22 = countSetBits0.countsetBits((long) (short) 0);
        long long24 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((-1L));
        long long22 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        long long20 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 100);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((-1L));
        long long20 = countSetBits0.countsetBits((-1L));
        long long22 = countSetBits0.countsetBits((long) '#');
        long long24 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (-1));
        long long20 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '4');
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) 'a');
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits(2L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits(10L);
        long long22 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) 'a');
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) (-1));
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits(100L);
        long long24 = countSetBits0.countsetBits(0L);
        long long26 = countSetBits0.countsetBits((long) (byte) 1);
        long long28 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) 0);
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        long long24 = countSetBits0.countsetBits((long) (-1));
        long long26 = countSetBits0.countsetBits((long) (short) -1);
        long long28 = countSetBits0.countsetBits((-1L));
        long long30 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) 0);
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        long long24 = countSetBits0.countsetBits((long) (-1));
        long long26 = countSetBits0.countsetBits((long) 100);
        long long28 = countSetBits0.countsetBits((long) (short) 1);
        long long30 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        long long22 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
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
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits(100L);
        long long24 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits(1L);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) 0);
        long long24 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '4');
        long long8 = countSetBits0.countsetBits(10L);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(100L);
        long long18 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        long long22 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits((long) 1);
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        long long24 = countSetBits0.countsetBits((long) (byte) 10);
        long long26 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) (short) 10);
        long long8 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) (short) 1);
        long long24 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits((long) '4');
        long long22 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) '#');
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits(100L);
        long long20 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        long long20 = countSetBits0.countsetBits((long) 1);
        long long22 = countSetBits0.countsetBits((long) (byte) 100);
        long long24 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits(2L);
        long long20 = countSetBits0.countsetBits((long) 0);
        long long22 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits((long) (short) 10);
        long long24 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        long long20 = countSetBits0.countsetBits((long) '4');
        long long22 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 1);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) (short) -1);
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        long long20 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) ' ');
        long long6 = countSetBits0.countsetBits((long) (byte) 0);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        long long24 = countSetBits0.countsetBits((long) (-1));
        long long26 = countSetBits0.countsetBits((long) '4');
        long long28 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((-1L));
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) 100);
        long long22 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits((-1L));
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        long long20 = countSetBits0.countsetBits((long) (-1));
        long long22 = countSetBits0.countsetBits(100L);
        long long24 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) (-1));
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits(100L);
        long long24 = countSetBits0.countsetBits((long) (short) 10);
        long long26 = countSetBits0.countsetBits((-1L));
        long long28 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits((long) (byte) 10);
        long long24 = countSetBits0.countsetBits((long) 0);
        long long26 = countSetBits0.countsetBits(0L);
        long long28 = countSetBits0.countsetBits(0L);
        long long30 = countSetBits0.countsetBits((long) (byte) 1);
        long long32 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (-1));
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        long long22 = countSetBits0.countsetBits(2L);
        long long24 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
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
        long long22 = countSetBits0.countsetBits((long) (byte) 10);
        long long24 = countSetBits0.countsetBits(1L);
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

