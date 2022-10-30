package Armstrong;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
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
        boolean boolean28 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
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
        boolean boolean22 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
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
        boolean boolean32 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
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
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
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
        boolean boolean20 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        boolean boolean26 = armstrong0.isArmstrong(10);
        boolean boolean28 = armstrong0.isArmstrong((int) 'a');
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
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
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((-1));
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
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
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
        boolean boolean28 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong(1);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean30 = armstrong0.isArmstrong((int) '#');
        boolean boolean32 = armstrong0.isArmstrong(0);
        boolean boolean34 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong(100);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
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
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong(100);
        boolean boolean26 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
        boolean boolean28 = armstrong0.isArmstrong(100);
        boolean boolean30 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
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
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean24 = armstrong0.isArmstrong(100);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
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
        boolean boolean22 = armstrong0.isArmstrong((-1));
        boolean boolean24 = armstrong0.isArmstrong(100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        boolean boolean32 = armstrong0.isArmstrong((int) 'a');
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
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean32 = armstrong0.isArmstrong((int) '#');
        boolean boolean34 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean36 = armstrong0.isArmstrong((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean34 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(0);
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
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
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
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean28 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean30 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
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
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
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
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong(10);
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
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
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
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong(1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
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
        boolean boolean28 = armstrong0.isArmstrong((-1));
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
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
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        boolean boolean30 = armstrong0.isArmstrong(100);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((-1));
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
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
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
        java.lang.Class<?> wildcardClass39 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
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
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
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
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(1);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong(1);
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
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
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
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean24 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((-1));
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
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
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
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean28 = armstrong0.isArmstrong((-1));
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean30 = armstrong0.isArmstrong((int) '#');
        boolean boolean32 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        boolean boolean20 = armstrong0.isArmstrong(100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean32 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean28 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong(1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
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
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong(100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
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
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        boolean boolean32 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
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
        boolean boolean20 = armstrong0.isArmstrong(100);
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
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
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean26 = armstrong0.isArmstrong(100);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong(10);
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
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
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
        boolean boolean22 = armstrong0.isArmstrong(10);
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
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
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
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
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
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
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
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((-1));
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
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        boolean boolean28 = armstrong0.isArmstrong((int) '4');
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean32 = armstrong0.isArmstrong(0);
        boolean boolean34 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean36 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
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
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
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
        boolean boolean20 = armstrong0.isArmstrong(100);
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
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong(100);
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
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
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
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean28 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(10);
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
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        boolean boolean38 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean40 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean42 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean44 = armstrong0.isArmstrong((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong(100);
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
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(0);
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
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong(10);
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
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
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
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
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
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
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
        boolean boolean26 = armstrong0.isArmstrong((-1));
        boolean boolean28 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 100);
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
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        boolean boolean26 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
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
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
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
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
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
        boolean boolean20 = armstrong0.isArmstrong(100);
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
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
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
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
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong(10);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong(100);
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
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
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
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
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
        boolean boolean32 = armstrong0.isArmstrong(1);
        boolean boolean34 = armstrong0.isArmstrong((int) '4');
        boolean boolean36 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean38 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass39 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(1);
        boolean boolean20 = armstrong0.isArmstrong(0);
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
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
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
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
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
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 10);
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
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
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
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong((-1));
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
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
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
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong(100);
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
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong(0);
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
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean32 = armstrong0.isArmstrong((int) 'a');
        boolean boolean34 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass35 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
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
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
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
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
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
        boolean boolean20 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong(1);
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
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
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
        boolean boolean30 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean26 = armstrong0.isArmstrong(100);
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
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
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
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        boolean boolean34 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean36 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass37 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
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
        boolean boolean28 = armstrong0.isArmstrong((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong(100);
        boolean boolean28 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
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
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong(0);
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
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
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
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
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
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) ' ');
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
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
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong(0);
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
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong(1);
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
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean30 = armstrong0.isArmstrong((int) '4');
        boolean boolean32 = armstrong0.isArmstrong((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong(10);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong(0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean8 = armstrong0.isArmstrong((int) '#');
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        boolean boolean28 = armstrong0.isArmstrong((int) '4');
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean32 = armstrong0.isArmstrong(0);
        boolean boolean34 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong(0);
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
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
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
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        boolean boolean28 = armstrong0.isArmstrong((int) '#');
        boolean boolean30 = armstrong0.isArmstrong((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
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
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
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
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong(1);
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
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        boolean boolean26 = armstrong0.isArmstrong(10);
        boolean boolean28 = armstrong0.isArmstrong((-1));
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong(10);
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
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        boolean boolean24 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong(100);
        boolean boolean26 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
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
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
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
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        boolean boolean22 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
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
        boolean boolean26 = armstrong0.isArmstrong(100);
        boolean boolean28 = armstrong0.isArmstrong((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
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
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
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
        boolean boolean22 = armstrong0.isArmstrong(1);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong(100);
        boolean boolean28 = armstrong0.isArmstrong(0);
        boolean boolean30 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(10);
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
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
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
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong(100);
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
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((-1));
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
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
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
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(100);
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
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        boolean boolean24 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong(10);
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
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean26 = armstrong0.isArmstrong(100);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
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
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean34 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean32 = armstrong0.isArmstrong((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
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
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
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
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
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
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean30 = armstrong0.isArmstrong(1);
        boolean boolean32 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
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
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
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
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
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
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
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
        boolean boolean22 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((-1));
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
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        boolean boolean28 = armstrong0.isArmstrong((int) '4');
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean32 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
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
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong(10);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
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
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong(0);
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
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong((-1));
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
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean24 = armstrong0.isArmstrong(10);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
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
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
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
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        boolean boolean28 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
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
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) 'a');
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong(1);
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        boolean boolean20 = armstrong0.isArmstrong(0);
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
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong(100);
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
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
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
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean32 = armstrong0.isArmstrong((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
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
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
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
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
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
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
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
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
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
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
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
        boolean boolean30 = armstrong0.isArmstrong((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean26 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong(1);
        boolean boolean20 = armstrong0.isArmstrong((-1));
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
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
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
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 10);
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
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
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
        boolean boolean28 = armstrong0.isArmstrong((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
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
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
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
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
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
        boolean boolean34 = armstrong0.isArmstrong(1);
        boolean boolean36 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean38 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
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
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((-1));
        boolean boolean4 = armstrong0.isArmstrong(1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass7 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
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
        boolean boolean26 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(100);
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
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong(100);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        boolean boolean28 = armstrong0.isArmstrong((int) '4');
        boolean boolean30 = armstrong0.isArmstrong(1);
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
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean28 = armstrong0.isArmstrong(10);
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
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
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
        boolean boolean24 = armstrong0.isArmstrong((-1));
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
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean28 = armstrong0.isArmstrong((int) ' ');
        boolean boolean30 = armstrong0.isArmstrong((int) ' ');
        boolean boolean32 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean34 = armstrong0.isArmstrong((int) '4');
        boolean boolean36 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean38 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
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
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong(1);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
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
        boolean boolean22 = armstrong0.isArmstrong((-1));
        boolean boolean24 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong(10);
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean32 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
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
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean30 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong((-1));
        boolean boolean28 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        boolean boolean26 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
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
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong(0);
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
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
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
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
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
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
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
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean28 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }
}

