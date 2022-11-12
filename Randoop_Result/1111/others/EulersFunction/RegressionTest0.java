package others.EulersFunction;

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
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.thealgorithms.others.EulersFunction eulersFunction0 = new com.thealgorithms.others.EulersFunction();
        java.lang.Class<?> wildcardClass1 = eulersFunction0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(24);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(8);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(40);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(16);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(96);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        int int1 = com.thealgorithms.others.EulersFunction.getEuler((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
    }
}

