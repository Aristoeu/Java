package others.countSetBits;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((-1L));
        long long20 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        long long20 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        long long24 = countSetBits0.countsetBits((long) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits((long) (short) 0);
        long long6 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits((long) 'a');
        long long10 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        long long24 = countSetBits0.countsetBits((long) 1);
        long long26 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        long long20 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '4');
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits(3L);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        long long20 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) 1);
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
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        long long20 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (byte) 1);
        long long6 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) (byte) 10);
        long long8 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) 'a');
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        long long22 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) -1);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (short) 10);
        long long8 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits((long) (short) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        long long24 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((-1L));
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        long long20 = countSetBits0.countsetBits((long) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits(0L);
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        long long22 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
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
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass5 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) '#');
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        long long24 = countSetBits0.countsetBits((long) 'a');
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 1);
        long long4 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass5 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) (short) -1);
        long long8 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        long long22 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        long long20 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        long long22 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
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
        long long24 = countSetBits0.countsetBits(1L);
        long long26 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) ' ');
        long long6 = countSetBits0.countsetBits((long) (short) 1);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
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
        long long20 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 1);
        long long4 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass5 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
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
        long long20 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) 10);
        long long20 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        long long22 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((-1L));
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        long long20 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        long long24 = countSetBits0.countsetBits((long) 1);
        long long26 = countSetBits0.countsetBits((long) 100);
        long long28 = countSetBits0.countsetBits(2L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) 10);
        long long20 = countSetBits0.countsetBits((-1L));
        long long22 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        long long20 = countSetBits0.countsetBits(3L);
        long long22 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.lang.Class<?> wildcardClass29 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (short) 10);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((-1L));
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits(2L);
        long long22 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        long long22 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 'a');
        long long10 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) (byte) 10);
        long long8 = countSetBits0.countsetBits((long) (byte) 100);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) 10);
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        long long26 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        long long20 = countSetBits0.countsetBits(3L);
        long long22 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) '#');
        long long20 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        long long22 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
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
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) 10);
        long long14 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(100L);
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        long long20 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) '#');
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) 10);
        long long20 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        long long22 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) '4');
        long long20 = countSetBits0.countsetBits((long) (byte) -1);
        long long22 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) 'a');
        long long10 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (byte) -1);
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
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
        long long20 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 1);
        long long4 = countSetBits0.countsetBits((long) 'a');
        long long6 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 0);
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits(3L);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) 0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
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
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (byte) 1);
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        long long20 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits(3L);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

