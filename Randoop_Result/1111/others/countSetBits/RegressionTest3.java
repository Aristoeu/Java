package others.countSetBits;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits(0L);
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
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        long long22 = countSetBits0.countsetBits(0L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) '#');
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
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '4');
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) 1);
        long long22 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        long long22 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (byte) 10);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits((long) (short) 0);
        long long6 = countSetBits0.countsetBits((long) (short) -1);
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((-1L));
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        long long22 = countSetBits0.countsetBits(100L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        long long20 = countSetBits0.countsetBits((long) '#');
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
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(100L);
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
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
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
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        long long24 = countSetBits0.countsetBits((long) 10);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(2L);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        long long24 = countSetBits0.countsetBits(100L);
        long long26 = countSetBits0.countsetBits((long) 10);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
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
        long long22 = countSetBits0.countsetBits((-1L));
        long long24 = countSetBits0.countsetBits((long) 0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        long long24 = countSetBits0.countsetBits((long) (byte) 10);
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
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        long long20 = countSetBits0.countsetBits(3L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits(3L);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) 10);
        long long20 = countSetBits0.countsetBits(1L);
        long long22 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 1);
        long long4 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass5 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        long long20 = countSetBits0.countsetBits(1L);
        long long22 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits((long) 'a');
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits(2L);
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
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
        long long24 = countSetBits0.countsetBits(10L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        long long24 = countSetBits0.countsetBits((long) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        long long14 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
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
        long long20 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(1L);
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
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) ' ');
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        long long20 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        long long22 = countSetBits0.countsetBits((long) '#');
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) ' ');
        long long20 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits(0L);
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
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((long) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) 0);
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
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        long long22 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(100L);
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
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        long long28 = countSetBits0.countsetBits((long) (-1));
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) 'a');
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
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 1);
        long long4 = countSetBits0.countsetBits((long) 'a');
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
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
        long long20 = countSetBits0.countsetBits((long) '#');
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        long long20 = countSetBits0.countsetBits(0L);
        long long22 = countSetBits0.countsetBits((long) (short) -1);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits(2L);
        long long6 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        long long22 = countSetBits0.countsetBits((long) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
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
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        long long26 = countSetBits0.countsetBits(3L);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
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
        long long22 = countSetBits0.countsetBits((long) (short) 1);
        long long24 = countSetBits0.countsetBits((long) 10);
        long long26 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
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
        long long24 = countSetBits0.countsetBits((long) (short) 1);
        long long26 = countSetBits0.countsetBits((long) (byte) -1);
        long long28 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass29 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 1);
        long long4 = countSetBits0.countsetBits((long) 'a');
        long long6 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits(2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        long long20 = countSetBits0.countsetBits(100L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        long long28 = countSetBits0.countsetBits((long) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
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
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        long long22 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) (byte) 10);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits(2L);
        long long20 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
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
        long long22 = countSetBits0.countsetBits((long) (short) 100);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
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
        long long24 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 1);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass5 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
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
        long long22 = countSetBits0.countsetBits((long) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
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
        long long20 = countSetBits0.countsetBits(1L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((-1L));
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
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
        long long20 = countSetBits0.countsetBits((long) 100);
        long long22 = countSetBits0.countsetBits((-1L));
        long long24 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
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
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
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
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 1);
        long long4 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        long long22 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
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
        long long28 = countSetBits0.countsetBits((long) '#');
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) '#');
        long long16 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits((long) (-1));
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
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits((long) 10);
        long long20 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        long long20 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        long long22 = countSetBits0.countsetBits((long) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits(100L);
        long long18 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
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
        long long22 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        long long20 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 0);
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
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
        long long18 = countSetBits0.countsetBits(0L);
        long long20 = countSetBits0.countsetBits((long) 10);
        long long22 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) 10);
        long long18 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (-1));
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
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits(1L);
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
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
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
        long long22 = countSetBits0.countsetBits((long) '4');
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
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
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        long long24 = countSetBits0.countsetBits((long) 1);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
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
        long long22 = countSetBits0.countsetBits((long) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 1);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) (short) -1);
        long long8 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
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
        long long22 = countSetBits0.countsetBits((long) (short) -1);
        long long24 = countSetBits0.countsetBits((long) '#');
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(3L);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) 'a');
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        long long20 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
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
        long long22 = countSetBits0.countsetBits((long) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
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
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((-1L));
        long long16 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(0L);
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
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits((long) 0);
        long long20 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        long long20 = countSetBits0.countsetBits((long) 100);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits(2L);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits(2L);
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
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
        long long20 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) 10);
        long long20 = countSetBits0.countsetBits((long) 1);
        long long22 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 10);
        long long10 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 100);
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
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits((long) (short) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) '4');
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(10L);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
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
        long long20 = countSetBits0.countsetBits((long) 1);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
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
        long long28 = countSetBits0.countsetBits((long) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
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
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) '#');
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        long long18 = countSetBits0.countsetBits(3L);
        long long20 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) 100);
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits(10L);
        long long10 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) -1);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((-1L));
        long long12 = countSetBits0.countsetBits((long) '#');
        long long14 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        long long20 = countSetBits0.countsetBits(10L);
        long long22 = countSetBits0.countsetBits((long) (short) 10);
        long long24 = countSetBits0.countsetBits((long) ' ');
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) 1);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) '#');
        long long16 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits((long) 100);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits(2L);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
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
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
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
        long long20 = countSetBits0.countsetBits(10L);
        long long22 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(1L);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        long long20 = countSetBits0.countsetBits((long) '#');
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
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits(10L);
        long long12 = countSetBits0.countsetBits((long) ' ');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        long long20 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
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
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
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
        long long22 = countSetBits0.countsetBits((long) (byte) 10);
        long long24 = countSetBits0.countsetBits((long) ' ');
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        long long14 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        long long20 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        long long18 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
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
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 1);
        long long18 = countSetBits0.countsetBits(2L);
        long long20 = countSetBits0.countsetBits((long) (short) 1);
        long long22 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (short) -1);
        long long8 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
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
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits(100L);
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
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
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
        long long22 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) 0);
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
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
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
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
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
        long long20 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) '4');
        long long14 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits((long) (short) 0);
        long long10 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(100L);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        long long16 = countSetBits0.countsetBits(10L);
        long long18 = countSetBits0.countsetBits((long) (short) 1);
        long long20 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        long long26 = countSetBits0.countsetBits(3L);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        long long22 = countSetBits0.countsetBits((long) 1);
        long long24 = countSetBits0.countsetBits((long) (short) 1);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) ' ');
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) (byte) -1);
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
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        long long16 = countSetBits0.countsetBits((long) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) '4');
        long long18 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) 1);
        long long20 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits((long) (short) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((-1L));
        long long8 = countSetBits0.countsetBits((long) ' ');
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
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
        long long24 = countSetBits0.countsetBits(0L);
        long long26 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 2L + "'", long26 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        long long24 = countSetBits0.countsetBits((long) (byte) 1);
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
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
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
        long long20 = countSetBits0.countsetBits(3L);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 2L + "'", long20 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) '#');
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 0);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (-1));
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
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) 0);
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
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
        long long20 = countSetBits0.countsetBits((long) '4');
        long long22 = countSetBits0.countsetBits(1L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) (byte) 100);
        long long8 = countSetBits0.countsetBits((long) 'a');
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) -1);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        long long24 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (-1));
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
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) '#');
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
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits((long) (short) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 1);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (short) 10);
        long long10 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
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
        long long20 = countSetBits0.countsetBits((long) (byte) 0);
        long long22 = countSetBits0.countsetBits((long) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
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
        long long24 = countSetBits0.countsetBits(10L);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
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
        long long22 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits(1L);
        long long16 = countSetBits0.countsetBits((long) '#');
        long long18 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 1);
        long long16 = countSetBits0.countsetBits((long) (short) 1);
        long long18 = countSetBits0.countsetBits((long) (short) 100);
        long long20 = countSetBits0.countsetBits((long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
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
        long long28 = countSetBits0.countsetBits((long) (short) 10);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 2L + "'", long28 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
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
        long long28 = countSetBits0.countsetBits((long) (byte) 0);
        long long30 = countSetBits0.countsetBits((long) (byte) 1);
        long long32 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass33 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1L + "'", long30 == 1L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 0);
        long long18 = countSetBits0.countsetBits((long) 0);
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
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) (short) 100);
        long long8 = countSetBits0.countsetBits(100L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits(1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
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
        long long22 = countSetBits0.countsetBits(0L);
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
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
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
        long long22 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(0L);
        long long6 = countSetBits0.countsetBits((long) 1);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(3L);
        long long12 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits(10L);
        long long20 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
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
        long long20 = countSetBits0.countsetBits((long) '4');
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 2L + "'", long24 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits(2L);
        long long18 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
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
        long long20 = countSetBits0.countsetBits((long) ' ');
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
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) 0);
        long long16 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits((long) (-1));
        long long8 = countSetBits0.countsetBits((long) 1);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((-1L));
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) (byte) 10);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits(100L);
        long long18 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '#');
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits((long) (short) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(100L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) 1);
        long long12 = countSetBits0.countsetBits((long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
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
        long long22 = countSetBits0.countsetBits((long) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 0);
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
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 100);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits((long) 1);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        long long22 = countSetBits0.countsetBits((long) (-1));
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
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
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) 100);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) '4');
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) '4');
        long long16 = countSetBits0.countsetBits(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
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
        long long26 = countSetBits0.countsetBits(1L);
        long long28 = countSetBits0.countsetBits((long) (short) 100);
        long long30 = countSetBits0.countsetBits((long) '#');
        long long32 = countSetBits0.countsetBits(0L);
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 3L + "'", long28 == 3L);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 3L + "'", long30 == 3L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 0);
        long long12 = countSetBits0.countsetBits((long) 'a');
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits(10L);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits(1L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (short) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
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
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
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
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) ' ');
        long long6 = countSetBits0.countsetBits((long) (short) 1);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits(0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) (short) -1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (byte) -1);
        long long14 = countSetBits0.countsetBits((long) (byte) 1);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        long long18 = countSetBits0.countsetBits((-1L));
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits(1L);
        long long10 = countSetBits0.countsetBits((long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 100);
        long long12 = countSetBits0.countsetBits((long) 0);
        long long14 = countSetBits0.countsetBits((long) ' ');
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
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        long long20 = countSetBits0.countsetBits((long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits(3L);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) (short) 1);
        long long14 = countSetBits0.countsetBits((long) 10);
        long long16 = countSetBits0.countsetBits(3L);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (short) 1);
        long long10 = countSetBits0.countsetBits((long) '4');
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits(100L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (short) 1);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits(0L);
        long long16 = countSetBits0.countsetBits((long) (byte) 10);
        long long18 = countSetBits0.countsetBits((long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
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
        java.lang.Class<?> wildcardClass21 = countSetBits0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits(10L);
        long long8 = countSetBits0.countsetBits((long) (short) 100);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
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
        long long22 = countSetBits0.countsetBits((long) (byte) -1);
        long long24 = countSetBits0.countsetBits((long) (short) 1);
        long long26 = countSetBits0.countsetBits(1L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) 10);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) 100);
        long long12 = countSetBits0.countsetBits((long) (byte) 1);
        long long14 = countSetBits0.countsetBits((long) ' ');
        long long16 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2L + "'", long6 == 2L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(100L);
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) 100);
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
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits(3L);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
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
        long long20 = countSetBits0.countsetBits(3L);
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
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits((long) 10);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) 100);
        long long16 = countSetBits0.countsetBits((long) (-1));
        long long18 = countSetBits0.countsetBits((long) (byte) 0);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(100L);
        long long6 = countSetBits0.countsetBits((long) '#');
        long long8 = countSetBits0.countsetBits((long) (byte) 1);
        long long10 = countSetBits0.countsetBits(1L);
        long long12 = countSetBits0.countsetBits((long) (byte) 10);
        long long14 = countSetBits0.countsetBits((long) '#');
        java.lang.Class<?> wildcardClass15 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        long long20 = countSetBits0.countsetBits(10L);
        long long22 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass23 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 2L + "'", long22 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        long long26 = countSetBits0.countsetBits((long) 'a');
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 3L + "'", long26 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) ' ');
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass7 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits((long) (short) 100);
        long long18 = countSetBits0.countsetBits((long) (byte) 10);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) (short) 1);
        long long6 = countSetBits0.countsetBits((long) 0);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (short) 10);
        long long12 = countSetBits0.countsetBits(0L);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits(10L);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2L + "'", long8 == 2L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 2L + "'", long16 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
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
        long long28 = countSetBits0.countsetBits((long) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) 10);
        long long6 = countSetBits0.countsetBits((long) 100);
        long long8 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass9 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) (byte) 0);
        long long4 = countSetBits0.countsetBits(3L);
        long long6 = countSetBits0.countsetBits((long) (byte) 1);
        long long8 = countSetBits0.countsetBits((long) 10);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) (-1));
        long long16 = countSetBits0.countsetBits((long) 1);
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
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(0L);
        long long8 = countSetBits0.countsetBits((-1L));
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits((long) (byte) -1);
        long long16 = countSetBits0.countsetBits((long) (-1));
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) 10);
        long long12 = countSetBits0.countsetBits((long) (short) 0);
        long long14 = countSetBits0.countsetBits((long) (short) 10);
        long long16 = countSetBits0.countsetBits((long) (byte) 100);
        java.lang.Class<?> wildcardClass17 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) 0);
        long long12 = countSetBits0.countsetBits((long) 1);
        long long14 = countSetBits0.countsetBits(3L);
        long long16 = countSetBits0.countsetBits(0L);
        long long18 = countSetBits0.countsetBits(10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
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
        long long24 = countSetBits0.countsetBits((long) 'a');
        long long26 = countSetBits0.countsetBits(2L);
        java.lang.Class<?> wildcardClass27 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 3L + "'", long24 == 3L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
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
        long long20 = countSetBits0.countsetBits((long) (short) -1);
        long long22 = countSetBits0.countsetBits((long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits((long) (short) 100);
        long long12 = countSetBits0.countsetBits((long) ' ');
        long long14 = countSetBits0.countsetBits((long) (short) -1);
        long long16 = countSetBits0.countsetBits((long) 'a');
        long long18 = countSetBits0.countsetBits((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 2L + "'", long18 == 2L);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
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
        long long22 = countSetBits0.countsetBits(1L);
        long long24 = countSetBits0.countsetBits((long) (byte) 0);
        long long26 = countSetBits0.countsetBits(1L);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1L + "'", long22 == 1L);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
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
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) '#');
        long long6 = countSetBits0.countsetBits(1L);
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) (byte) 0);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
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
        long long20 = countSetBits0.countsetBits((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3L + "'", long20 == 3L);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
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
        long long24 = countSetBits0.countsetBits((long) (short) -1);
        java.lang.Class<?> wildcardClass25 = countSetBits0.getClass();
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (-1));
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) '#');
        long long10 = countSetBits0.countsetBits((long) 10);
        long long12 = countSetBits0.countsetBits(0L);
        java.lang.Class<?> wildcardClass13 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 2L + "'", long10 == 2L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits(3L);
        long long8 = countSetBits0.countsetBits((long) (byte) -1);
        long long10 = countSetBits0.countsetBits((long) 'a');
        long long12 = countSetBits0.countsetBits((long) (-1));
        long long14 = countSetBits0.countsetBits(2L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
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
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits(2L);
        long long8 = countSetBits0.countsetBits(0L);
        long long10 = countSetBits0.countsetBits(0L);
        long long12 = countSetBits0.countsetBits(2L);
        long long14 = countSetBits0.countsetBits((long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) (-1));
        long long10 = countSetBits0.countsetBits((long) 0);
        java.lang.Class<?> wildcardClass11 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits((long) 'a');
        long long4 = countSetBits0.countsetBits((long) 10);
        long long6 = countSetBits0.countsetBits((long) ' ');
        long long8 = countSetBits0.countsetBits((long) 0);
        long long10 = countSetBits0.countsetBits((long) (byte) -1);
        long long12 = countSetBits0.countsetBits(10L);
        long long14 = countSetBits0.countsetBits(100L);
        long long16 = countSetBits0.countsetBits((long) (short) -1);
        long long18 = countSetBits0.countsetBits((long) (byte) -1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3L + "'", long2 == 3L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 2L + "'", long4 == 2L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2L + "'", long12 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        com.thealgorithms.others.countSetBits countSetBits0 = new com.thealgorithms.others.countSetBits();
        long long2 = countSetBits0.countsetBits(0L);
        long long4 = countSetBits0.countsetBits((long) (short) -1);
        long long6 = countSetBits0.countsetBits((long) 'a');
        long long8 = countSetBits0.countsetBits((long) (byte) 0);
        long long10 = countSetBits0.countsetBits((long) (-1));
        long long12 = countSetBits0.countsetBits((long) (short) 100);
        long long14 = countSetBits0.countsetBits((long) (short) 100);
        long long16 = countSetBits0.countsetBits(1L);
        long long18 = countSetBits0.countsetBits((long) (byte) 1);
        java.lang.Class<?> wildcardClass19 = countSetBits0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3L + "'", long12 == 3L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1L + "'", long18 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }
}

