package Armstrong;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
        boolean boolean24 = armstrong0.isArmstrong(10);
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
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong(1);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((-1));
        boolean boolean4 = armstrong0.isArmstrong(1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
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
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((-1));
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
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
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
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong(100);
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
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((-1));
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
        boolean boolean28 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong(1);
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        boolean boolean28 = armstrong0.isArmstrong((int) '#');
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
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(100);
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
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
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
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(0);
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
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
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
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean30 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
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
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
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
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean32 = armstrong0.isArmstrong(100);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong(1);
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
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((-1));
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
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
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
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
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
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
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
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong(100);
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
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(1);
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
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
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
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        boolean boolean34 = armstrong0.isArmstrong((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
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
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
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
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong(0);
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
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
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
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
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
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong(0);
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
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        boolean boolean26 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong(100);
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
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
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
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        boolean boolean20 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
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
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong(100);
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
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong(100);
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        boolean boolean28 = armstrong0.isArmstrong(1);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean32 = armstrong0.isArmstrong(100);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
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
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(100);
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
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        boolean boolean28 = armstrong0.isArmstrong((int) 'a');
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
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong(100);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
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
        boolean boolean32 = armstrong0.isArmstrong((int) '4');
        boolean boolean34 = armstrong0.isArmstrong((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
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
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((-1));
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
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
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
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong(10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        boolean boolean32 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass5 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
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
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong(1);
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
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
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
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
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
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        boolean boolean34 = armstrong0.isArmstrong(0);
        boolean boolean36 = armstrong0.isArmstrong((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
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
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
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
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
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
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong(1);
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
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean30 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
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
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
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
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        boolean boolean28 = armstrong0.isArmstrong(10);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean32 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) -1);
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
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
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
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
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
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
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
        boolean boolean28 = armstrong0.isArmstrong((int) '4');
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
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean16 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
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
        boolean boolean30 = armstrong0.isArmstrong(10);
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
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
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
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong(100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean30 = armstrong0.isArmstrong(100);
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
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean32 = armstrong0.isArmstrong((int) 'a');
        boolean boolean34 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass35 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
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
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) '#');
        boolean boolean8 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass9 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass9 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((-1));
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
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(10);
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
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
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
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
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
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        boolean boolean20 = armstrong0.isArmstrong(10);
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
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
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
        boolean boolean28 = armstrong0.isArmstrong((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        boolean boolean22 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean30 = armstrong0.isArmstrong((-1));
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
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        boolean boolean32 = armstrong0.isArmstrong((int) '#');
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
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
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
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
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
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
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
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        boolean boolean28 = armstrong0.isArmstrong(10);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 10);
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
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong(10);
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
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong(100);
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
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
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
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        boolean boolean22 = armstrong0.isArmstrong(100);
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
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        boolean boolean26 = armstrong0.isArmstrong(100);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
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
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        boolean boolean28 = armstrong0.isArmstrong(1);
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
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
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        boolean boolean20 = armstrong0.isArmstrong(1);
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
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        boolean boolean26 = armstrong0.isArmstrong((-1));
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
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong(1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
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
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '#');
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(100);
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
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
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
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean22 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
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
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(10);
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
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
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
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
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
        boolean boolean42 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(10);
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
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        boolean boolean40 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean42 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass43 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(1);
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
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        boolean boolean28 = armstrong0.isArmstrong(0);
        boolean boolean30 = armstrong0.isArmstrong((int) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
        boolean boolean32 = armstrong0.isArmstrong((int) (short) 100);
        java.lang.Class<?> wildcardClass33 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong(100);
        boolean boolean18 = armstrong0.isArmstrong(1);
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
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) ' ');
        boolean boolean22 = armstrong0.isArmstrong((-1));
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
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean24 = armstrong0.isArmstrong((int) ' ');
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
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        boolean boolean32 = armstrong0.isArmstrong((int) '#');
        boolean boolean34 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
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
        boolean boolean28 = armstrong0.isArmstrong((int) '#');
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean26 = armstrong0.isArmstrong((int) '4');
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
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((-1));
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
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean32 = armstrong0.isArmstrong((int) 'a');
        boolean boolean34 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean36 = armstrong0.isArmstrong((int) ' ');
        java.lang.Class<?> wildcardClass37 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        boolean boolean20 = armstrong0.isArmstrong(0);
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
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        boolean boolean24 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        boolean boolean20 = armstrong0.isArmstrong(1);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean26 = armstrong0.isArmstrong(100);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong(10);
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
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        boolean boolean24 = armstrong0.isArmstrong((int) '#');
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong(100);
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
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong(100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
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
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) -1);
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
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass23 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) '#');
        boolean boolean10 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
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
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        boolean boolean24 = armstrong0.isArmstrong(100);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) ' ');
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
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
        boolean boolean22 = armstrong0.isArmstrong(100);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
        boolean boolean36 = armstrong0.isArmstrong((-1));
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
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong(100);
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong(10);
        boolean boolean26 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(0);
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
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
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
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong(0);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
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
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
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
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong(1);
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
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
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        boolean boolean32 = armstrong0.isArmstrong((-1));
        boolean boolean34 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean36 = armstrong0.isArmstrong(100);
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
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean18 = armstrong0.isArmstrong((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        boolean boolean22 = armstrong0.isArmstrong((-1));
        boolean boolean24 = armstrong0.isArmstrong(100);
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
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong(100);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong(0);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean30 = armstrong0.isArmstrong(100);
        boolean boolean32 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((-1));
        boolean boolean8 = armstrong0.isArmstrong((int) 'a');
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        boolean boolean14 = armstrong0.isArmstrong(0);
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
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
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
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
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
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        boolean boolean20 = armstrong0.isArmstrong((int) '4');
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean20 = armstrong0.isArmstrong(100);
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
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
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
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
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
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
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
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
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
        boolean boolean28 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
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
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        boolean boolean26 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 1);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(1);
        boolean boolean20 = armstrong0.isArmstrong(0);
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
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) '4');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((-1));
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        boolean boolean26 = armstrong0.isArmstrong(1);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        boolean boolean26 = armstrong0.isArmstrong(0);
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
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong((-1));
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
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) ' ');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
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
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((-1));
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
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
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
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
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        boolean boolean30 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) -1);
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
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
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
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong(100);
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) 'a');
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
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        boolean boolean24 = armstrong0.isArmstrong(10);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
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
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass15 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
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
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        boolean boolean28 = armstrong0.isArmstrong(0);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
        boolean boolean22 = armstrong0.isArmstrong((int) ' ');
        boolean boolean24 = armstrong0.isArmstrong((int) '4');
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) '4');
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) '#');
        boolean boolean28 = armstrong0.isArmstrong(100);
        boolean boolean30 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass31 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong(1);
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
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
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
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
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
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean14 = armstrong0.isArmstrong(1);
        boolean boolean16 = armstrong0.isArmstrong((-1));
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
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        boolean boolean24 = armstrong0.isArmstrong(1);
        boolean boolean26 = armstrong0.isArmstrong((int) 'a');
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean32 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean34 = armstrong0.isArmstrong((int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong(10);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean20 = armstrong0.isArmstrong((int) 'a');
        boolean boolean22 = armstrong0.isArmstrong((int) 'a');
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
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        boolean boolean20 = armstrong0.isArmstrong(100);
        boolean boolean22 = armstrong0.isArmstrong((int) '4');
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
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 1);
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
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean24 = armstrong0.isArmstrong(0);
        boolean boolean26 = armstrong0.isArmstrong((-1));
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean20 = armstrong0.isArmstrong(0);
        boolean boolean22 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean26 = armstrong0.isArmstrong((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
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
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 10);
        java.lang.Class<?> wildcardClass27 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong(10);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
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
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 100);
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
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean18 = armstrong0.isArmstrong((-1));
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
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        boolean boolean28 = armstrong0.isArmstrong((int) (byte) 1);
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
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        boolean boolean24 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass25 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(1);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(0);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean16 = armstrong0.isArmstrong(0);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong(10);
        boolean boolean12 = armstrong0.isArmstrong(1);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
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
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((-1));
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong(10);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
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
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(100);
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
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong(100);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 1);
        java.lang.Class<?> wildcardClass29 = armstrong0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
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
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong(100);
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) '4');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong(0);
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
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        boolean boolean20 = armstrong0.isArmstrong((int) (byte) 100);
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
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
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
        boolean boolean26 = armstrong0.isArmstrong(10);
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
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        boolean boolean26 = armstrong0.isArmstrong((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong(10);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong(100);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean18 = armstrong0.isArmstrong((int) '#');
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
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        boolean boolean30 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean32 = armstrong0.isArmstrong((int) '4');
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
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean18 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass19 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong(100);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
        boolean boolean14 = armstrong0.isArmstrong((int) '#');
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
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong(0);
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        boolean boolean16 = armstrong0.isArmstrong(1);
        boolean boolean18 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong(100);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean20 = armstrong0.isArmstrong((int) '#');
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
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) ' ');
        boolean boolean10 = armstrong0.isArmstrong(100);
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean16 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean18 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean20 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
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
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
        java.lang.Class<?> wildcardClass21 = armstrong0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(1);
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) 'a');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean18 = armstrong0.isArmstrong(1);
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
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean12 = armstrong0.isArmstrong((int) 'a');
        boolean boolean14 = armstrong0.isArmstrong((int) 'a');
        boolean boolean16 = armstrong0.isArmstrong((int) (byte) 0);
        boolean boolean18 = armstrong0.isArmstrong((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        boolean boolean26 = armstrong0.isArmstrong(1);
        boolean boolean28 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean30 = armstrong0.isArmstrong((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean10 = armstrong0.isArmstrong((int) ' ');
        boolean boolean12 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong(0);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) '#');
        boolean boolean12 = armstrong0.isArmstrong((int) ' ');
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
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
        boolean boolean22 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean24 = armstrong0.isArmstrong(10);
        boolean boolean26 = armstrong0.isArmstrong(100);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 1);
        boolean boolean10 = armstrong0.isArmstrong((int) '4');
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) (byte) 100);
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
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong(100);
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
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong(10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean12 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 0);
        boolean boolean16 = armstrong0.isArmstrong((-1));
        boolean boolean18 = armstrong0.isArmstrong((int) (short) -1);
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
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        boolean boolean22 = armstrong0.isArmstrong(10);
        boolean boolean24 = armstrong0.isArmstrong((int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        boolean boolean24 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean26 = armstrong0.isArmstrong((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean12 = armstrong0.isArmstrong((int) '4');
        boolean boolean14 = armstrong0.isArmstrong(0);
        boolean boolean16 = armstrong0.isArmstrong((int) '#');
        boolean boolean18 = armstrong0.isArmstrong(10);
        boolean boolean20 = armstrong0.isArmstrong(1);
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
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) (short) -1);
        boolean boolean6 = armstrong0.isArmstrong((int) (short) 100);
        boolean boolean8 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        boolean boolean14 = armstrong0.isArmstrong((int) (short) 1);
        boolean boolean16 = armstrong0.isArmstrong((int) 'a');
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
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
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
        boolean boolean20 = armstrong0.isArmstrong((-1));
        boolean boolean22 = armstrong0.isArmstrong(0);
        boolean boolean24 = armstrong0.isArmstrong((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean4 = armstrong0.isArmstrong((-1));
        boolean boolean6 = armstrong0.isArmstrong((int) '4');
        boolean boolean8 = armstrong0.isArmstrong((-1));
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(10);
        boolean boolean14 = armstrong0.isArmstrong((int) '4');
        boolean boolean16 = armstrong0.isArmstrong((int) ' ');
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
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        com.thealgorithms.maths.Armstrong armstrong0 = new com.thealgorithms.maths.Armstrong();
        boolean boolean2 = armstrong0.isArmstrong((int) '4');
        boolean boolean4 = armstrong0.isArmstrong((int) 'a');
        boolean boolean6 = armstrong0.isArmstrong((int) (byte) -1);
        boolean boolean8 = armstrong0.isArmstrong((int) (short) 10);
        boolean boolean10 = armstrong0.isArmstrong((int) (byte) 10);
        boolean boolean12 = armstrong0.isArmstrong(0);
        java.lang.Class<?> wildcardClass13 = armstrong0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}
