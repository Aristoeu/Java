package Armstrong;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong(100);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean32 = armstrong0.isArmstrong((int) ' ');
        boolean boolean34 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong(0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong(0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass9 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean28 = armstrong0.isArmstrong(0);
        boolean boolean30 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean26 = armstrong0.isArmstrong((-1));
        boolean boolean28 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean26 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong(10);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean30 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong(100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong(10);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean26 = armstrong0.isArmstrong((-1));
        boolean boolean28 = armstrong0.isArmstrong(1);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean34 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean36 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean28 = armstrong0.isArmstrong(1);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong(100);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean28 = armstrong0.isArmstrong((int) ' ');
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean26 = armstrong0.isArmstrong((-1));
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean30 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean28 = armstrong0.isArmstrong((int) ' ');
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean32 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((-1));
        boolean boolean4 = armstrong0.isArmstrong(1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean30 = armstrong0.isArmstrong(1);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean34 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean36 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass37 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(1);
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong(10);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((-1));
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean28 = armstrong0.isArmstrong(100);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean32 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean30 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong(0);
        boolean boolean30 = armstrong0.isArmstrong((int) '#');
        boolean boolean32 = armstrong0.isArmstrong((int) '4');
        boolean boolean34 = armstrong0.isArmstrong(10);
        boolean boolean36 = armstrong0.isArmstrong(1);
        boolean boolean38 = armstrong0.isArmstrong(0);
        boolean boolean40 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass41 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean28 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong((-1));
        boolean boolean30 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean30 = armstrong0.isArmstrong(1);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean34 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass35 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean32 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong(10);
        boolean boolean30 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong(10);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((-1));
        boolean boolean30 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean32 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        boolean boolean28 = armstrong0.isArmstrong((int) '#');
        boolean boolean30 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        boolean boolean28 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong(0);
        boolean boolean30 = armstrong0.isArmstrong((int) '#');
        boolean boolean32 = armstrong0.isArmstrong((int) '4');
        boolean boolean34 = armstrong0.isArmstrong(10);
        boolean boolean36 = armstrong0.isArmstrong(1);
        boolean boolean38 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean40 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass41 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong(100);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean34 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong(0);
        boolean boolean30 = armstrong0.isArmstrong((int) '#');
        boolean boolean32 = armstrong0.isArmstrong((int) '4');
        boolean boolean34 = armstrong0.isArmstrong(10);
        boolean boolean36 = armstrong0.isArmstrong(1);
        boolean boolean38 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean40 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass41 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean30 = armstrong0.isArmstrong(100);
        boolean boolean32 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean28 = armstrong0.isArmstrong((int) '#');
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong(0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass9 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean26 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong(10);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong(0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean8 = armstrong0.isArmstrong((int) '#');
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(100);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        boolean boolean28 = armstrong0.isArmstrong(0);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean32 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong(1);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean10 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong(100);
        boolean boolean26 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong(100);
        boolean boolean22 = armstrong0.isArmstrong(1);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong(100);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean28 = armstrong0.isArmstrong((-1));
        boolean boolean30 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong((-1));
        boolean boolean28 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean26 = armstrong0.isArmstrong((-1));
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean28 = armstrong0.isArmstrong(1);
        boolean boolean30 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        boolean boolean26 = armstrong0.isArmstrong(100);
        boolean boolean28 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean24 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean28 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean28 = armstrong0.isArmstrong(0);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean34 = armstrong0.isArmstrong(100);
        boolean boolean36 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong(100);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean30 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }
}

