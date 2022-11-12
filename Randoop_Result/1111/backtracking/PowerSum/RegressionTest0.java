package backtracking.PowerSum;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        java.lang.Class<?> wildcardClass1 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass5 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass8 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum((int) (byte) 100, (int) '4', (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        java.lang.Class<?> wildcardClass10 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(0, 0);
        java.lang.Class<?> wildcardClass11 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        powerSum0.Sum((int) (short) 100, 10, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        java.lang.Class<?> wildcardClass17 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        powerSum0.Sum((-1), 0, (int) ' ');
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(100, (int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        java.lang.Class<?> wildcardClass10 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        powerSum0.Sum((-1), (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        powerSum0.Sum((int) 'a', (int) '#', 100);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        powerSum0.Sum((int) (short) -1, (int) 'a', 10);
        int int32 = powerSum0.powSum((-1), 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        powerSum0.Sum((int) (byte) 10, (int) (short) 100, 7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        java.lang.Class<?> wildcardClass14 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        java.lang.Class<?> wildcardClass21 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 0, (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass9 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum((int) (short) 0, (int) (short) -1, (int) '4');
        int int24 = powerSum0.powSum((int) ' ', 2);
        java.lang.Class<?> wildcardClass25 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        powerSum0.Sum(0, 3, (-1));
        java.lang.Class<?> wildcardClass25 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        int int15 = powerSum0.powSum((int) '4', (int) '4');
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass4 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (short) 10, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass17 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        int int16 = powerSum0.powSum(0, (int) (short) 1);
        powerSum0.Sum((int) '4', (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass29 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) '4', 7, 2);
        java.lang.Class<?> wildcardClass9 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum((int) (short) 0, (int) (short) -1, (int) '4');
        java.lang.Class<?> wildcardClass22 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        powerSum0.Sum(100, 100, (int) 'a');
        java.lang.Class<?> wildcardClass21 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        int int16 = powerSum0.powSum(0, (int) (short) 1);
        int int19 = powerSum0.powSum(1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum(5, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass9 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass22 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(100, (int) '#', (int) (byte) 10);
        powerSum0.Sum(0, (int) (byte) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        int int10 = powerSum0.powSum((int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((int) ' ', 10, 0);
        java.lang.Class<?> wildcardClass23 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) (short) 1, (int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(2, 1, 6);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        powerSum0.Sum(100, 100, (int) 'a');
        powerSum0.Sum(7, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 100, (int) (short) 10);
        int int28 = powerSum0.powSum(6, 3);
        java.lang.Class<?> wildcardClass29 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        powerSum0.Sum(586, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        powerSum0.Sum((int) (short) -1, (int) 'a', 10);
        java.lang.Class<?> wildcardClass30 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum(10, (int) '#', (int) (short) 10);
        powerSum0.Sum((int) (short) 0, 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        int int22 = powerSum0.powSum((int) (byte) 1, (int) ' ');
        int int25 = powerSum0.powSum(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        powerSum0.Sum((int) (short) -1, 10, 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((-1), (int) (byte) 0);
        int int6 = powerSum0.powSum(0, 0);
        java.lang.Class<?> wildcardClass7 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        int int19 = powerSum0.powSum(0, 0);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum((int) '4', 3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (short) 1, 10);
        powerSum0.Sum(6, 3, 5);
        powerSum0.Sum(0, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        java.lang.Class<?> wildcardClass33 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum(7, (int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        java.lang.Class<?> wildcardClass15 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (byte) 0, 10);
        powerSum0.Sum((int) (byte) 10, 3, (int) '#');
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        powerSum0.Sum(100, 100, (int) 'a');
        powerSum0.Sum(7, (int) 'a', (int) (byte) 100);
        int int27 = powerSum0.powSum((int) (short) 100, 2);
        int int30 = powerSum0.powSum((-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 10, 5);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(100, 2);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (byte) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        powerSum0.Sum((int) (short) 100, 1, (int) '4');
        powerSum0.Sum((int) (short) 0, 5, (int) (short) 1);
        int int18 = powerSum0.powSum((int) '#', 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum(10, 5, (int) (short) -1);
        powerSum0.Sum((int) (byte) 100, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum((int) (byte) 10, (int) (byte) 10);
        powerSum0.Sum(1, (-1), (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) (byte) 100, 590);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum((int) (byte) 10, (int) (byte) 10);
        powerSum0.Sum((int) (byte) 100, 7, (int) '#');
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        powerSum0.Sum((int) (short) 100, 10, (int) (short) 0);
        powerSum0.Sum(7, (int) (byte) 1, 2);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum(10, 5, (int) (short) -1);
        int int18 = powerSum0.powSum((int) (short) 1, 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((int) (byte) -1, 2, (int) (byte) -1);
        int int25 = powerSum0.powSum((int) (short) 100, 586);
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) '4', 7, 2);
        powerSum0.Sum(0, (int) (byte) 10, (int) (byte) 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum(6, (int) ' ');
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum(10, 5, (int) (short) -1);
        powerSum0.Sum((int) (byte) 0, 3, (int) (byte) 1);
        powerSum0.Sum((-1), (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum(10, 6);
        int int22 = powerSum0.powSum((int) (byte) 0, 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) ' ', 4, (int) (byte) 1);
        int int11 = powerSum0.powSum(0, 590);
        int int14 = powerSum0.powSum((int) (short) 10, 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        int int14 = powerSum0.powSum((int) (byte) -1, 6);
        java.lang.Class<?> wildcardClass15 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum(5, (int) '4', 1);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        int int18 = powerSum0.powSum((int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((int) (byte) -1, 2, (int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        powerSum0.Sum(10, 2, (int) '#');
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        powerSum0.Sum((int) 'a', (int) '#', 100);
        powerSum0.Sum((int) (short) -1, 5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((-1), (int) (byte) 0);
        int int6 = powerSum0.powSum(0, 0);
        powerSum0.Sum((int) '4', 7, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum(10, 5, (int) (short) -1);
        powerSum0.Sum((int) (byte) 100, (int) 'a', (int) (byte) 100);
        int int22 = powerSum0.powSum(100, (int) '#');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        java.lang.Class<?> wildcardClass4 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        int int10 = powerSum0.powSum((int) (byte) 1, (int) (byte) 10);
        int int13 = powerSum0.powSum(0, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        int int6 = powerSum0.powSum((int) '4', 3);
        powerSum0.Sum((int) (byte) 10, (int) (byte) 1, 590);
        java.lang.Class<?> wildcardClass11 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (byte) 1, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass9 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum((int) (short) 0, (int) (short) -1, (int) '4');
        int int24 = powerSum0.powSum((int) ' ', 2);
        powerSum0.Sum((int) (byte) 100, 3, 3);
        java.lang.Class<?> wildcardClass29 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        int int15 = powerSum0.powSum((int) (byte) 1, 2);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 100, 2);
        int int26 = powerSum0.powSum((int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass27 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum((int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass15 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        int int10 = powerSum0.powSum((int) (byte) 1, (int) (byte) 10);
        int int13 = powerSum0.powSum((-1), 397);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        powerSum0.Sum(0, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        powerSum0.Sum((int) (short) 0, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        int int19 = powerSum0.powSum(397, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum((int) (short) 1, 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        powerSum0.Sum(7, 2, (int) 'a');
        powerSum0.Sum((int) (short) 1, (int) (byte) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(100, (int) '#', (int) (byte) 10);
        int int15 = powerSum0.powSum((int) (byte) 10, 7);
        powerSum0.Sum((int) (byte) 0, 4, 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum((int) (byte) 10, (int) (byte) 10);
        powerSum0.Sum(1, (-1), (int) (byte) 0);
        powerSum0.Sum((int) (byte) 10, (int) (byte) 10, 2);
        int int25 = powerSum0.powSum(396, 397);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum(10, 5, (int) (short) -1);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (short) 1, 10, 7);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        java.lang.Class<?> wildcardClass18 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        int int22 = powerSum0.powSum((int) (byte) 1, (int) ' ');
        int int25 = powerSum0.powSum((int) (short) 0, 6);
        int int28 = powerSum0.powSum((int) ' ', 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 100, (int) (short) 10);
        powerSum0.Sum(0, (int) (short) 100, 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(0, 0);
        powerSum0.Sum(10, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass15 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (byte) 0, 10);
        int int14 = powerSum0.powSum((int) '#', 1);
        powerSum0.Sum((int) (short) 100, (int) '4', (int) '#');
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 586 + "'", int14 == 586);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (byte) 100, 10, 3);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        int int11 = powerSum0.powSum((int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        int int15 = powerSum0.powSum((int) (short) 1, (-1));
        powerSum0.Sum(100, (int) '4', (int) (byte) 10);
        powerSum0.Sum((-1), 0, 2);
        java.lang.Class<?> wildcardClass24 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        int int6 = powerSum0.powSum(1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        powerSum0.Sum((int) 'a', (int) '#', 100);
        int int21 = powerSum0.powSum((int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        int int15 = powerSum0.powSum((int) (byte) 1, 2);
        int int18 = powerSum0.powSum(4, 397);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        powerSum0.Sum(0, (-1), (int) (short) 0);
        int int18 = powerSum0.powSum(2, 5);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(0, 0);
        powerSum0.Sum(10, (int) (short) -1, 0);
        powerSum0.Sum(4, (int) (byte) 100, (int) '4');
        powerSum0.Sum(10, 586, 397);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum((int) (byte) 10, (int) (byte) 10);
        powerSum0.Sum(1, (-1), (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        java.lang.Class<?> wildcardClass17 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        int int22 = powerSum0.powSum((int) (byte) 1, (int) ' ');
        powerSum0.Sum(4, (int) '4', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) ' ', 4, (int) (byte) 1);
        int int11 = powerSum0.powSum(5, (int) 'a');
        powerSum0.Sum((int) '#', (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum((int) (byte) 100, (int) '4', (int) (byte) 100);
        int int22 = powerSum0.powSum((int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum((int) '4', 3, (int) (byte) 0);
        int int18 = powerSum0.powSum(6, 7);
        int int21 = powerSum0.powSum((int) (byte) 100, 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum(6, (int) ' ');
        powerSum0.Sum(397, (int) (byte) 1, 590);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (short) 1, 10, 7);
        powerSum0.Sum((int) (short) -1, (-1), 3);
        powerSum0.Sum(6, 7, (int) '4');
        powerSum0.Sum((int) (short) 0, 396, (int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum(5, (int) (short) 10);
        powerSum0.Sum((int) (byte) 0, (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum((int) (short) -1, (int) (byte) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        int int16 = powerSum0.powSum(0, (int) (short) 1);
        int int19 = powerSum0.powSum(6, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(0, 6, 3);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) (short) 1, (int) (byte) -1, 1);
        int int28 = powerSum0.powSum(6, 397);
        java.lang.Class<?> wildcardClass29 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        int int15 = powerSum0.powSum((int) (byte) 1, 2);
        int int18 = powerSum0.powSum((int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum(100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        powerSum0.Sum(397, (int) 'a', (int) (short) -1);
        int int39 = powerSum0.powSum(396, 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        powerSum0.Sum(2, 5, 2);
        int int18 = powerSum0.powSum(5, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) ' ', 4, (int) (byte) 1);
        int int11 = powerSum0.powSum(0, 590);
        powerSum0.Sum((int) (byte) 1, 3, 3);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        powerSum0.Sum(7, 396, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (short) 1, 6);
        java.lang.Class<?> wildcardClass7 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum((int) (short) 0, (int) (short) -1, (int) '4');
        int int24 = powerSum0.powSum(0, (int) (short) -1);
        int int27 = powerSum0.powSum((int) (short) 100, 5);
        java.lang.Class<?> wildcardClass28 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 7 + "'", int27 == 7);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum(5, (int) '4', 1);
        powerSum0.Sum(5, 397, (int) (byte) 1);
        powerSum0.Sum(1, (int) ' ', 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        powerSum0.Sum((int) (short) 1, 4, (int) 'a');
        java.lang.Class<?> wildcardClass21 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum(10, 6);
        powerSum0.Sum((int) '4', (int) '#', 0);
        java.lang.Class<?> wildcardClass24 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum(10, (int) '#', (int) (short) 10);
        powerSum0.Sum((int) (short) 0, 1, (int) (byte) 0);
        powerSum0.Sum((int) (short) -1, 590, (int) (byte) 0);
        int int22 = powerSum0.powSum(0, 4);
        int int25 = powerSum0.powSum((int) (byte) -1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        powerSum0.Sum((int) 'a', (int) '#', 100);
        powerSum0.Sum((int) (short) -1, 5, (int) (byte) 10);
        powerSum0.Sum(2, 3, 397);
        powerSum0.Sum((int) (byte) 0, 0, 0);
        powerSum0.Sum(5, (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 10, 5);
        int int21 = powerSum0.powSum(1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        powerSum0.Sum(7, 2, (int) 'a');
        java.lang.Class<?> wildcardClass21 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        powerSum0.Sum((int) (short) -1, (int) 'a', 10);
        int int32 = powerSum0.powSum(586, 590);
        java.lang.Class<?> wildcardClass33 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 100, 2);
        int int26 = powerSum0.powSum((int) (byte) -1, (-1));
        powerSum0.Sum(0, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass31 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 100, 590, 0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum((int) (short) 0, (int) (short) -1, (int) '4');
        int int24 = powerSum0.powSum((int) (byte) 0, (int) (byte) -1);
        powerSum0.Sum((int) (short) 1, 6, 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        int int19 = powerSum0.powSum(586, 7);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) ' ', (int) '4', 7);
        powerSum0.Sum(4, (int) (short) 100, (int) '#');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        int int24 = powerSum0.powSum((int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass25 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        java.lang.Class<?> wildcardClass8 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum(10, (int) '#', (int) (short) 10);
        powerSum0.Sum((int) (short) 0, 1, (int) (byte) 0);
        powerSum0.Sum((int) (short) -1, 590, (int) (byte) 0);
        int int22 = powerSum0.powSum(0, 4);
        powerSum0.Sum((int) (byte) 10, 586, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        powerSum0.Sum((int) (short) 100, 10, (-1));
        powerSum0.Sum((int) '4', 2, (int) (byte) 1);
        powerSum0.Sum(4, (int) (short) 1, 4);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        powerSum0.Sum((int) (short) -1, (int) 'a', 10);
        int int32 = powerSum0.powSum(586, 590);
        int int35 = powerSum0.powSum(100, 397);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        int int21 = powerSum0.powSum((int) (short) 100, (int) (short) 10);
        int int24 = powerSum0.powSum((int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((int) (byte) -1, 2, (int) (byte) -1);
        int int25 = powerSum0.powSum((int) (byte) 0, (-1));
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (short) 1, 10, 7);
        powerSum0.Sum((int) (short) -1, (-1), 3);
        powerSum0.Sum(6, 7, (int) '4');
        java.lang.Class<?> wildcardClass28 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        powerSum0.Sum(7, 10, 0);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        int int22 = powerSum0.powSum((int) (byte) 1, (int) ' ');
        int int25 = powerSum0.powSum(0, (int) (byte) -1);
        powerSum0.Sum((int) (short) -1, 10, (int) (short) -1);
        int int32 = powerSum0.powSum((int) ' ', (int) 'a');
        int int35 = powerSum0.powSum((int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(0, 0);
        powerSum0.Sum((-1), (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass15 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 5, 12);
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum((int) (short) 0, (int) (short) -1, (int) '4');
        int int24 = powerSum0.powSum((int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(100, (int) '#', (int) (byte) 10);
        int int15 = powerSum0.powSum((int) (byte) 10, 7);
        int int18 = powerSum0.powSum(0, 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        powerSum0.Sum((int) (byte) 10, 7, (int) (short) -1);
        powerSum0.Sum((int) (short) 100, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (short) -1, 396, (-1));
        powerSum0.Sum(590, (int) 'a', 5);
        powerSum0.Sum(10, 590, (int) '4');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        int int6 = powerSum0.powSum((int) '4', 3);
        java.lang.Class<?> wildcardClass7 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        powerSum0.Sum((int) (short) 100, 1, (int) '4');
        powerSum0.Sum((int) (short) 0, 5, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) '4', 7, 2);
        powerSum0.Sum(100, 397, 398);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        java.lang.Class<?> wildcardClass8 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        powerSum0.Sum((int) (byte) 10, 7, (int) (short) -1);
        powerSum0.Sum((int) (short) 100, (int) (short) -1, (int) (byte) -1);
        int int21 = powerSum0.powSum((int) (short) 100, 7);
        powerSum0.Sum(4, (int) '#', (int) (short) 10);
        int int28 = powerSum0.powSum((int) '4', (int) '4');
        int int31 = powerSum0.powSum((int) ' ', (int) (byte) 10);
        powerSum0.Sum(12, (int) (byte) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass36 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        int int35 = powerSum0.powSum((int) ' ', (int) (byte) 1);
        int int38 = powerSum0.powSum(1, (int) '#');
        powerSum0.Sum((int) (byte) 0, (int) '4', (int) (byte) 1);
        powerSum0.Sum(7, (int) (byte) 100, 6);
        int int49 = powerSum0.powSum((int) '4', 6);
        powerSum0.Sum(396, 398, 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 396 + "'", int35 == 396);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 397 + "'", int38 == 397);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 398 + "'", int49 == 398);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        powerSum0.Sum((int) 'a', (int) '#', 100);
        powerSum0.Sum((int) (short) -1, 5, (int) (byte) 10);
        int int25 = powerSum0.powSum((int) (short) -1, (int) ' ');
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        int int19 = powerSum0.powSum((-1), (int) (short) 100);
        powerSum0.Sum((int) (byte) 10, 586, (int) '#');
        java.lang.Class<?> wildcardClass24 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        powerSum0.Sum(397, (int) 'a', (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(0, (int) '4', 0);
        java.lang.Class<?> wildcardClass14 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((int) 'a', (int) 'a');
        powerSum0.Sum((int) ' ', (int) (byte) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        int int12 = powerSum0.powSum(1, 590);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) (short) -1, 1);
        powerSum0.Sum((int) '#', 7, 0);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (short) 1, 10);
        int int14 = powerSum0.powSum(4, 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        int int22 = powerSum0.powSum((int) (byte) 1, (int) ' ');
        int int25 = powerSum0.powSum(0, (int) (byte) -1);
        powerSum0.Sum((int) (short) -1, 10, (int) (short) -1);
        int int32 = powerSum0.powSum((int) ' ', (int) 'a');
        powerSum0.Sum((int) '#', 6, 396);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        powerSum0.Sum((int) (short) 0, 0, (int) (short) 100);
        powerSum0.Sum(2, (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass25 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (short) 1, 10, 7);
        powerSum0.Sum((int) (short) -1, (-1), 3);
        java.lang.Class<?> wildcardClass24 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 10, 5);
        powerSum0.Sum(586, 3, (int) (short) -1);
        int int25 = powerSum0.powSum((int) '#', 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        int int16 = powerSum0.powSum(0, (int) (short) 1);
        powerSum0.Sum((int) '4', (int) ' ', (int) (byte) -1);
        int int23 = powerSum0.powSum(100, 2);
        powerSum0.Sum((int) (short) -1, (int) 'a', 3);
        java.lang.Class<?> wildcardClass28 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (byte) 100, 10, 3);
        int int22 = powerSum0.powSum((int) 'a', 7);
        powerSum0.Sum((int) '#', (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum(12, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass14 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum(12, (int) ' ', (int) (short) 100);
        int int11 = powerSum0.powSum(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        int int22 = powerSum0.powSum((int) (byte) 1, (int) ' ');
        int int25 = powerSum0.powSum(0, (int) (byte) -1);
        powerSum0.Sum((int) (short) -1, 10, (int) (short) -1);
        int int32 = powerSum0.powSum(397, 398);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(100, (int) '#', (int) (byte) 10);
        int int15 = powerSum0.powSum((int) (byte) 10, 7);
        powerSum0.Sum((int) (byte) 10, 3, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) '4', 7, 2);
        powerSum0.Sum((int) (short) 10, 10, (int) (short) -1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        int int35 = powerSum0.powSum((int) ' ', (int) (byte) 1);
        powerSum0.Sum(1, 398, 2);
        int int42 = powerSum0.powSum((-1), 12);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 396 + "'", int35 == 396);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 396 + "'", int42 == 396);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(6, 7);
        int int26 = powerSum0.powSum(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (byte) 1, 5, 5);
        int int30 = powerSum0.powSum(6, (int) ' ');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) (short) -1, 1);
        powerSum0.Sum((int) '#', 7, 0);
        int int14 = powerSum0.powSum((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 390 + "'", int14 == 390);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum(4, 6);
        int int17 = powerSum0.powSum((int) (byte) -1, 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((-1), (int) (byte) 0);
        int int6 = powerSum0.powSum(0, 0);
        int int9 = powerSum0.powSum(6, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        int int14 = powerSum0.powSum(3, 10);
        int int17 = powerSum0.powSum((int) 'a', 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(6, 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        int int18 = powerSum0.powSum((int) (byte) 0, (int) '#');
        int int21 = powerSum0.powSum(5, 397);
        int int24 = powerSum0.powSum(5, 5);
        int int27 = powerSum0.powSum(397, (int) ' ');
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        int int21 = powerSum0.powSum(5, 7);
        int int24 = powerSum0.powSum((int) (short) 10, (int) ' ');
        java.lang.Class<?> wildcardClass25 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (short) -1, (int) (short) 0);
        int int21 = powerSum0.powSum((int) (byte) 0, (int) (short) -1);
        int int24 = powerSum0.powSum(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((-1), (int) (byte) 0);
        int int6 = powerSum0.powSum(0, 0);
        powerSum0.Sum((int) (byte) 10, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass11 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(0, 0);
        powerSum0.Sum(10, (int) (short) -1, 0);
        powerSum0.Sum(4, (int) (byte) 100, (int) '4');
        powerSum0.Sum((int) (byte) 0, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        int int10 = powerSum0.powSum((int) '#', (int) (byte) 10);
        powerSum0.Sum(7, (int) (short) 1, 5);
        java.lang.Class<?> wildcardClass15 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) '4', 7, 2);
        int int11 = powerSum0.powSum(0, (int) (short) 0);
        powerSum0.Sum((int) (short) 1, 398, (int) ' ');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (byte) 1, 5, 5);
        java.lang.Class<?> wildcardClass28 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        int int17 = powerSum0.powSum(0, 0);
        int int20 = powerSum0.powSum((int) '#', 398);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        powerSum0.Sum((int) (byte) 10, 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum(10, 6);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((int) ' ', 10, 0);
        powerSum0.Sum(0, 7, (int) (short) 1);
        powerSum0.Sum((int) (byte) 100, (int) '#', (int) (short) -1);
        powerSum0.Sum((int) (short) 10, 2, (int) '4');
        java.lang.Class<?> wildcardClass35 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(0, 6, 3);
        int int22 = powerSum0.powSum((int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass23 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        powerSum0.Sum((int) 'a', (int) '#', 100);
        powerSum0.Sum((int) (short) -1, 5, (int) (byte) 10);
        int int25 = powerSum0.powSum((int) (short) -1, (int) ' ');
        powerSum0.Sum((-1), (int) (byte) 100, (int) (short) 1);
        java.lang.Class<?> wildcardClass30 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        int int6 = powerSum0.powSum((int) '4', 3);
        powerSum0.Sum((int) (byte) 10, (int) (byte) 1, 590);
        powerSum0.Sum((int) (short) 10, (int) (byte) 10, 398);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (byte) 1, 5, 5);
        int int30 = powerSum0.powSum(396, (int) (byte) 100);
        powerSum0.Sum(5, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        powerSum0.Sum(0, 3, (-1));
        powerSum0.Sum((int) 'a', 5, (int) 'a');
        powerSum0.Sum((int) (short) 0, (int) (byte) 100, 10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((int) (byte) -1, 2, (int) (byte) -1);
        int int25 = powerSum0.powSum((int) (short) -1, 10);
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        powerSum0.Sum(7, 4, 100);
        java.lang.Class<?> wildcardClass18 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) ' ', (int) '4', 7);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (byte) 0, 10);
        int int14 = powerSum0.powSum((int) '#', 1);
        int int17 = powerSum0.powSum(590, 7);
        int int20 = powerSum0.powSum(7, 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 586 + "'", int14 == 586);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 586 + "'", int17 == 586);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 586 + "'", int20 == 586);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        powerSum0.Sum(100, 100, (int) 'a');
        powerSum0.Sum(2, 4, 397);
        java.lang.Class<?> wildcardClass25 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum((int) (byte) 100, (int) ' ');
        powerSum0.Sum(1, (int) (short) 10, 3);
        int int26 = powerSum0.powSum((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        int int10 = powerSum0.powSum((int) (short) 1, 590);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        int int9 = powerSum0.powSum((int) (short) -1, 586);
        java.lang.Class<?> wildcardClass10 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        int int18 = powerSum0.powSum((int) (byte) 0, (int) '#');
        int int21 = powerSum0.powSum(5, 397);
        int int24 = powerSum0.powSum(5, 5);
        java.lang.Class<?> wildcardClass25 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 100, (int) (short) 0);
        powerSum0.Sum(10, 100, (int) (byte) 0);
        powerSum0.Sum((int) (byte) 10, 590, 7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        powerSum0.Sum(5, (int) '#', 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum((-1), 590, 398);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) ' ', 4, (int) (byte) 1);
        int int11 = powerSum0.powSum(5, (int) 'a');
        int int14 = powerSum0.powSum((-1), (int) (short) -1);
        powerSum0.Sum((-1), 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        int int19 = powerSum0.powSum((-1), (int) (short) 100);
        powerSum0.Sum((int) (byte) 10, 586, (int) '#');
        powerSum0.Sum((int) (short) 100, 396, 1);
        java.lang.Class<?> wildcardClass28 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (short) -1, 396);
        int int9 = powerSum0.powSum((int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 586 + "'", int9 == 586);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        int int14 = powerSum0.powSum(5, (int) '#');
        java.lang.Class<?> wildcardClass15 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) '4', 7, 2);
        int int11 = powerSum0.powSum(0, (int) (short) 0);
        int int14 = powerSum0.powSum(1, 100);
        java.lang.Class<?> wildcardClass15 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        powerSum0.Sum(7, 1, 6);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        int int10 = powerSum0.powSum(5, (int) ' ');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(6, (int) '#');
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(2, 1, 6);
        powerSum0.Sum(4, (int) '4', 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(100, (int) '#', (int) (byte) 10);
        int int15 = powerSum0.powSum((int) (byte) 10, 7);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) 'a', (-1));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((int) ' ', 10, 0);
        powerSum0.Sum(0, 7, (int) (short) 1);
        powerSum0.Sum((int) (byte) 100, (int) '#', (int) (short) -1);
        powerSum0.Sum(590, (int) '#', 586);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (short) 1, 6);
        int int9 = powerSum0.powSum((int) '4', 2);
        powerSum0.Sum(0, 2, 10);
        java.lang.Class<?> wildcardClass14 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 5, 12);
        powerSum0.Sum((int) (byte) 100, 2, 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        powerSum0.Sum(100, 100, (int) 'a');
        powerSum0.Sum(7, (int) 'a', (int) (byte) 100);
        int int27 = powerSum0.powSum((int) (short) 100, 2);
        powerSum0.Sum((int) (byte) 100, 4, 590);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum(5, (int) (short) 10);
        powerSum0.Sum(3, 10, 586);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum((int) '4', 3, (int) (byte) 0);
        int int18 = powerSum0.powSum(6, 7);
        int int21 = powerSum0.powSum((int) (short) 100, 397);
        java.lang.Class<?> wildcardClass22 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum(12, (int) ' ', (int) (short) 100);
        powerSum0.Sum(5, (int) ' ', 3);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 1, (int) '4');
        powerSum0.Sum(396, (int) (short) -1, 0);
        powerSum0.Sum((int) (byte) 1, (-1), (int) (short) -1);
        powerSum0.Sum(10, 590, 396);
        java.lang.Class<?> wildcardClass36 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        int int19 = powerSum0.powSum((-1), (int) (short) 100);
        powerSum0.Sum((int) (byte) -1, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum((int) (byte) 10, (int) (byte) 10);
        powerSum0.Sum(1, (-1), (int) (byte) 0);
        powerSum0.Sum((int) (byte) 10, (int) (byte) 10, 2);
        powerSum0.Sum(0, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        int int14 = powerSum0.powSum((int) (byte) -1, 6);
        int int17 = powerSum0.powSum((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) 1, (int) '#');
        powerSum0.Sum((int) (byte) 0, (int) (byte) 0, 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 1, (int) '4');
        powerSum0.Sum(396, (int) (short) -1, 0);
        powerSum0.Sum((int) (byte) 1, (-1), (int) (short) -1);
        powerSum0.Sum(10, 590, 396);
        powerSum0.Sum(5, 4, 590);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(0, 6, 3);
        powerSum0.Sum((int) (short) -1, 100, (int) '#');
        java.lang.Class<?> wildcardClass24 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        int int11 = powerSum0.powSum(4, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 100, 2);
        int int26 = powerSum0.powSum((int) (short) 100, (int) (short) 100);
        powerSum0.Sum((int) 'a', 5, 586);
        powerSum0.Sum(7, (int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        powerSum0.Sum((int) (short) 100, 10, (int) (short) 0);
        powerSum0.Sum(100, (int) (byte) 10, 7);
        powerSum0.Sum((int) (byte) 0, (int) '#', 398);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(6, 7);
        powerSum0.Sum(390, 100, (int) 'a');
        powerSum0.Sum(0, 4, 590);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        int int9 = powerSum0.powSum(5, 397);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        int int21 = powerSum0.powSum(5, 7);
        java.lang.Class<?> wildcardClass22 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(0, 6, 3);
        powerSum0.Sum(4, (int) (byte) 1, 3);
        int int26 = powerSum0.powSum(100, (int) '4');
        java.lang.Class<?> wildcardClass27 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 10, 5);
        powerSum0.Sum(6, 7, (int) '4');
        java.lang.Class<?> wildcardClass23 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum((int) '4', 3, (int) (byte) 0);
        int int18 = powerSum0.powSum(6, 7);
        int int21 = powerSum0.powSum(5, 586);
        int int24 = powerSum0.powSum((int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum((int) '4', 3, (int) (byte) 0);
        powerSum0.Sum(0, 4, 6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (short) 1, 10);
        powerSum0.Sum(10, (int) (byte) 1, 5);
        powerSum0.Sum((int) (byte) 100, 396, 586);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) ' ', 4, (int) (byte) 1);
        int int11 = powerSum0.powSum(0, 590);
        powerSum0.Sum((int) (byte) 1, 3, 3);
        powerSum0.Sum(3, (int) (byte) 1, (int) 'a');
        powerSum0.Sum((int) (short) 100, 390, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((-1), (int) (byte) 0);
        powerSum0.Sum((int) (byte) -1, 10, 590);
        powerSum0.Sum((int) (short) 10, 397, 12);
        powerSum0.Sum(4, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (byte) 100, 10, 3);
        powerSum0.Sum(2, 3, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 10, (int) (short) 100);
        int int6 = powerSum0.powSum((int) (short) 100, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        int int15 = powerSum0.powSum((int) (short) 1, (-1));
        powerSum0.Sum(100, (int) '4', (int) (byte) 10);
        powerSum0.Sum(0, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        powerSum0.Sum((int) 'a', 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass11 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum(10, 5, (int) (short) -1);
        int int18 = powerSum0.powSum(0, 0);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 100, 2);
        int int26 = powerSum0.powSum((int) (short) 100, (int) (short) 100);
        int int29 = powerSum0.powSum((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass30 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 7 + "'", int29 == 7);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        int int15 = powerSum0.powSum((int) (short) 1, (-1));
        powerSum0.Sum(1, 7, 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        int int9 = powerSum0.powSum((int) (short) -1, 586);
        int int12 = powerSum0.powSum((-1), 2);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        powerSum0.Sum(0, (-1), (int) (short) 0);
        int int18 = powerSum0.powSum((-1), 397);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (byte) 0, 10);
        int int14 = powerSum0.powSum((int) '#', 1);
        int int17 = powerSum0.powSum(590, 7);
        java.lang.Class<?> wildcardClass18 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 586 + "'", int14 == 586);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 586 + "'", int17 == 586);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        powerSum0.Sum(10, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        int int18 = powerSum0.powSum(100, 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (short) 1, 10);
        powerSum0.Sum((int) (byte) -1, 100, 390);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum(0, 397);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        int int18 = powerSum0.powSum((int) 'a', (int) '#');
        powerSum0.Sum((int) '#', 5, (int) (short) 10);
        int int25 = powerSum0.powSum((int) (byte) -1, 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 100, (int) (short) 10);
        int int28 = powerSum0.powSum((int) '#', (int) (byte) 1);
        powerSum0.Sum(12, (int) (short) 100, 1);
        powerSum0.Sum((int) (byte) 0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 590 + "'", int28 == 590);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) ' ', (int) '4', 7);
        powerSum0.Sum(4, (int) (short) 100, (int) '#');
        powerSum0.Sum((int) (byte) -1, (int) (short) 0, 0);
        int int26 = powerSum0.powSum(3, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (byte) 1, 5, 5);
        int int30 = powerSum0.powSum((-1), 10);
        java.lang.Class<?> wildcardClass31 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (short) -1, 396);
        java.lang.Class<?> wildcardClass7 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        int int15 = powerSum0.powSum((int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        powerSum0.Sum(0, 3, (-1));
        powerSum0.Sum((int) 'a', 5, (int) 'a');
        powerSum0.Sum(0, (int) (byte) 100, 2);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        int int35 = powerSum0.powSum((int) ' ', (int) (byte) 1);
        int int38 = powerSum0.powSum(1, (int) '#');
        powerSum0.Sum((int) (byte) 0, (int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass43 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 396 + "'", int35 == 396);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 397 + "'", int38 == 397);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum((int) '#', 3);
        int int17 = powerSum0.powSum(10, 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum(10, (int) '#', (int) (short) 10);
        powerSum0.Sum(10, 7, 6);
        powerSum0.Sum(398, 397, (int) (short) 10);
        int int22 = powerSum0.powSum(12, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        int int24 = powerSum0.powSum((int) 'a', (int) '#');
        int int27 = powerSum0.powSum(100, 396);
        powerSum0.Sum(4, 398, (int) (short) 100);
        java.lang.Class<?> wildcardClass32 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        powerSum0.Sum((int) (short) -1, (int) 'a', 10);
        int int32 = powerSum0.powSum(586, 590);
        int int35 = powerSum0.powSum((int) (byte) 10, (int) (byte) 10);
        powerSum0.Sum((int) 'a', 100, 586);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(1, 586, (int) (short) 1);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        int int18 = powerSum0.powSum((int) 'a', (int) '#');
        int int21 = powerSum0.powSum((int) '4', 590);
        int int24 = powerSum0.powSum(10, 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        int int22 = powerSum0.powSum((int) (byte) 1, (int) ' ');
        int int25 = powerSum0.powSum((int) (short) 0, 6);
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum(1, 1, 12);
        int int11 = powerSum0.powSum(1, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (byte) 0, 10);
        int int14 = powerSum0.powSum((int) '#', 1);
        int int17 = powerSum0.powSum(590, 7);
        powerSum0.Sum((int) (short) 1, 590, (int) 'a');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 586 + "'", int14 == 586);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 586 + "'", int17 == 586);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 100, 2);
        int int26 = powerSum0.powSum((int) (short) 100, (int) (short) 100);
        powerSum0.Sum((int) 'a', 5, 586);
        int int33 = powerSum0.powSum((int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        int int11 = powerSum0.powSum((int) '4', 590);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum((int) '#', 10);
        int int10 = powerSum0.powSum((int) (short) -1, (int) (short) 100);
        int int13 = powerSum0.powSum(2, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        powerSum0.Sum((int) (byte) 10, 7, (int) (short) -1);
        powerSum0.Sum((int) (short) 100, (int) (short) -1, (int) (byte) -1);
        int int21 = powerSum0.powSum((int) (short) 100, 7);
        powerSum0.Sum(4, (int) '#', (int) (short) 10);
        int int28 = powerSum0.powSum((int) '4', (int) '4');
        int int31 = powerSum0.powSum((int) ' ', (int) (byte) 10);
        int int34 = powerSum0.powSum((int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(0, 6, 3);
        powerSum0.Sum(4, (int) (byte) 1, 3);
        int int26 = powerSum0.powSum(12, 397);
        java.lang.Class<?> wildcardClass27 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum(4, 6);
        int int17 = powerSum0.powSum(100, 390);
        powerSum0.Sum(0, 398, 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        powerSum0.Sum((int) ' ', 7, (int) '#');
        powerSum0.Sum(0, (int) '#', (int) ' ');
        int int17 = powerSum0.powSum((int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        int int12 = powerSum0.powSum(1, 590);
        int int15 = powerSum0.powSum((int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (byte) 0, 10);
        powerSum0.Sum((int) (short) 1, 12, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum(5, (int) '4', 1);
        int int22 = powerSum0.powSum((int) (short) 1, 0);
        int int25 = powerSum0.powSum(3, 100);
        powerSum0.Sum(16, (int) (byte) 100, 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (byte) 1, 5, 5);
        powerSum0.Sum((int) (short) 1, 1, (int) (short) 0);
        int int34 = powerSum0.powSum(396, (int) '4');
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 5 + "'", int34 == 5);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (byte) 100, 10, 3);
        int int22 = powerSum0.powSum((int) 'a', 7);
        powerSum0.Sum((int) (short) 100, (int) (byte) 100, (int) (short) 1);
        powerSum0.Sum(10, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum((int) '#', 10);
        int int10 = powerSum0.powSum((int) (short) -1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 0, (int) 'a', (int) (byte) 10);
        powerSum0.Sum(6, 390, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((-1), (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        int int14 = powerSum0.powSum(5, (int) '#');
        powerSum0.Sum(0, (int) (short) 1, 4);
        powerSum0.Sum(390, 3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass23 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        powerSum0.Sum((int) 'a', (int) '#', 100);
        powerSum0.Sum(396, 3, 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(0, 6, 3);
        powerSum0.Sum((int) (short) -1, 100, (int) '#');
        powerSum0.Sum(100, 398, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) '4', 7, 2);
        powerSum0.Sum((int) ' ', 4, 5);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum(10, (int) '#', (int) (short) 10);
        powerSum0.Sum((int) (short) 0, 1, (int) (byte) 0);
        powerSum0.Sum((int) (short) -1, 590, (int) (byte) 0);
        int int22 = powerSum0.powSum(0, 4);
        java.lang.Class<?> wildcardClass23 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (byte) 1, 5, 5);
        int int30 = powerSum0.powSum((int) (short) 1, 100);
        powerSum0.Sum((int) (byte) -1, 0, 12);
        powerSum0.Sum(590, (int) '4', 396);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        int int19 = powerSum0.powSum((-1), (int) (short) 100);
        powerSum0.Sum((int) (byte) 10, 1, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum((int) (short) 10, (int) (byte) 1, 1);
        powerSum0.Sum((int) (short) 10, (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass24 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        powerSum0.Sum(586, (int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (short) 1, 10);
        powerSum0.Sum((int) 'a', 398, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        java.lang.Class<?> wildcardClass29 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        powerSum0.Sum(10, 2, (int) '#');
        powerSum0.Sum((int) (byte) 10, 396, (int) 'a');
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum(5, (int) '4', 1);
        int int22 = powerSum0.powSum((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass23 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum((int) (byte) 100, (int) ' ');
        int int22 = powerSum0.powSum(0, 390);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        java.lang.Class<?> wildcardClass11 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum(1, 397, 3);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) ' ', 4, (int) (byte) 1);
        int int11 = powerSum0.powSum(5, (int) 'a');
        powerSum0.Sum((int) ' ', 5, (int) (short) 1);
        int int18 = powerSum0.powSum(0, 4);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        powerSum0.Sum((int) (byte) 1, 396, 397);
        java.lang.Class<?> wildcardClass11 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(0, 6, 3);
        powerSum0.Sum(4, (int) (byte) 1, 3);
        int int26 = powerSum0.powSum((int) (short) 100, 100);
        powerSum0.Sum(16, (int) (byte) 100, 590);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        powerSum0.Sum((int) (short) 0, (int) (short) 10, (int) '#');
        int int13 = powerSum0.powSum((int) (short) 100, 12);
        powerSum0.Sum((int) (short) 0, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass18 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        int int21 = powerSum0.powSum(5, 7);
        int int24 = powerSum0.powSum(586, (int) (byte) 10);
        powerSum0.Sum(0, (int) ' ', 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (byte) 100, 10, 3);
        powerSum0.Sum(12, (int) 'a', (int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(6, 7);
        powerSum0.Sum(390, 100, (int) 'a');
        int int30 = powerSum0.powSum(396, 590);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        int int19 = powerSum0.powSum((int) (short) 1, 5);
        powerSum0.Sum(7, 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(100, 2);
        powerSum0.Sum(0, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum(10, 5, (int) (short) -1);
        powerSum0.Sum((int) (byte) 100, (int) 'a', (int) (byte) 100);
        powerSum0.Sum((-1), (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        int int9 = powerSum0.powSum(10, (int) (byte) 1);
        int int12 = powerSum0.powSum((int) (byte) -1, 10);
        powerSum0.Sum(590, (int) (byte) 100, 586);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        powerSum0.Sum((int) (byte) 10, 7, (int) (short) -1);
        powerSum0.Sum((int) (short) 100, (int) (short) -1, (int) (byte) -1);
        int int21 = powerSum0.powSum((int) (short) 100, 7);
        powerSum0.Sum(4, (int) '#', (int) (short) 10);
        int int28 = powerSum0.powSum((int) '4', (int) '4');
        int int31 = powerSum0.powSum((int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass32 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        int int35 = powerSum0.powSum(4, 3);
        java.lang.Class<?> wildcardClass36 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        powerSum0.Sum((int) (short) 100, 1, (int) '4');
        powerSum0.Sum(397, 10, 3);
        int int18 = powerSum0.powSum((-1), 1);
        int int21 = powerSum0.powSum((int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        int int22 = powerSum0.powSum((int) (byte) 1, (int) ' ');
        int int25 = powerSum0.powSum((int) (short) 0, 6);
        powerSum0.Sum(12, 590, (int) '#');
        int int32 = powerSum0.powSum((int) '4', (int) (short) 10);
        int int35 = powerSum0.powSum(4, 7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        int int35 = powerSum0.powSum((int) ' ', (int) (byte) 1);
        int int38 = powerSum0.powSum(1, (int) '#');
        int int41 = powerSum0.powSum((int) (short) 100, (int) ' ');
        powerSum0.Sum(590, 11, (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 396 + "'", int35 == 396);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 397 + "'", int38 == 397);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 397 + "'", int41 == 397);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((int) ' ', 10, 0);
        powerSum0.Sum(0, 7, (int) (short) 1);
        java.lang.Class<?> wildcardClass27 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        int int12 = powerSum0.powSum(1, 590);
        powerSum0.Sum(398, (int) ' ', 590);
        java.lang.Class<?> wildcardClass17 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        int int18 = powerSum0.powSum(3, 10);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 100, (int) (short) 10);
        int int28 = powerSum0.powSum((int) '#', (int) (byte) 1);
        int int31 = powerSum0.powSum((int) (byte) -1, 396);
        int int34 = powerSum0.powSum(396, 590);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 590 + "'", int28 == 590);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 590 + "'", int31 == 590);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 590 + "'", int34 == 590);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        powerSum0.Sum(2, 5, 2);
        int int18 = powerSum0.powSum((int) (short) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 1, (int) '4');
        powerSum0.Sum(396, (int) (short) -1, 0);
        powerSum0.Sum((int) (byte) 1, (-1), (int) (short) -1);
        powerSum0.Sum(10, 590, 396);
        int int38 = powerSum0.powSum((int) (byte) 10, 398);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        powerSum0.Sum((int) (short) 100, 1, (int) '4');
        powerSum0.Sum(397, 10, 3);
        int int18 = powerSum0.powSum((-1), 1);
        powerSum0.Sum(586, (int) '4', 10);
        powerSum0.Sum(397, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        powerSum0.Sum((int) (byte) 100, 2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass37 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum(0, 397);
        powerSum0.Sum((int) 'a', (int) (short) 100, 586);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (byte) 1, (int) (short) -1, 0);
        int int11 = powerSum0.powSum(6, (int) 'a');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (short) -1, (int) (short) 0);
        powerSum0.Sum(5, 16, 398);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        powerSum0.Sum((int) 'a', 100, (int) (short) -1);
        int int13 = powerSum0.powSum(590, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((int) 'a', (int) 'a');
        powerSum0.Sum(23, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum(4, 6);
        int int17 = powerSum0.powSum(10, (int) (byte) 1);
        powerSum0.Sum(10, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        int int12 = powerSum0.powSum((-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        int int18 = powerSum0.powSum((int) (byte) 100, 7);
        powerSum0.Sum((int) (byte) -1, 2, (int) (byte) -1);
        int int25 = powerSum0.powSum((int) (short) -1, 10);
        powerSum0.Sum(0, 12, 398);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        powerSum0.Sum((int) (short) 0, (int) (short) 10, (int) '#');
        java.lang.Class<?> wildcardClass11 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum(10, (int) '#', (int) (short) 10);
        powerSum0.Sum(10, 100, (int) (byte) 10);
        powerSum0.Sum((int) (byte) 10, 5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        int int16 = powerSum0.powSum(0, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum((int) (short) -1, (int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (byte) 1, 5, 5);
        powerSum0.Sum((int) (short) 1, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass32 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        int int19 = powerSum0.powSum((-1), (int) (short) 100);
        powerSum0.Sum((int) (short) -1, 396, 5);
        powerSum0.Sum(586, 10, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        powerSum0.Sum((int) (short) 100, 10, (int) (short) 0);
        powerSum0.Sum(100, (int) (byte) 10, 7);
        powerSum0.Sum(16, (int) (short) 1, 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (byte) 1, 5, 5);
        int int30 = powerSum0.powSum(396, (int) (byte) 100);
        powerSum0.Sum((int) (byte) 0, 23, 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        powerSum0.Sum(586, (int) (byte) 10, (int) (byte) 0);
        powerSum0.Sum(1, 11, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        int int18 = powerSum0.powSum((int) 'a', (int) '#');
        int int21 = powerSum0.powSum(16, 100);
        int int24 = powerSum0.powSum(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum(3, 100, (int) (short) -1);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum(11, 7, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        int int16 = powerSum0.powSum(0, (int) (short) 1);
        powerSum0.Sum((int) '4', (int) ' ', (int) (byte) -1);
        powerSum0.Sum(100, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum(7, (int) (byte) 100, (int) (short) -1);
        powerSum0.Sum(396, 7, 4);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        int int15 = powerSum0.powSum((int) (byte) 1, 2);
        powerSum0.Sum((int) (short) 0, 12, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        int int11 = powerSum0.powSum(4, (int) 'a');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        powerSum0.Sum((int) (short) 0, 0, (int) (short) 100);
        powerSum0.Sum(2, (int) (short) -1, (-1));
        powerSum0.Sum(7, 398, (int) '4');
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum(10, (int) '#', (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum(1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass8 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        powerSum0.Sum(0, (-1), (int) (short) 0);
        powerSum0.Sum(390, (int) (short) 10, 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (short) 1, 10, 7);
        powerSum0.Sum(5, (int) (short) 100, 396);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        int int9 = powerSum0.powSum(10, (int) (byte) 1);
        int int12 = powerSum0.powSum((int) (byte) -1, 10);
        powerSum0.Sum(0, (int) (short) 1, (int) (short) 1);
        powerSum0.Sum(0, 397, 6);
        java.lang.Class<?> wildcardClass21 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        powerSum0.Sum(397, (int) 'a', (int) (short) -1);
        int int39 = powerSum0.powSum((int) '4', 23);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 6 + "'", int39 == 6);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        int int16 = powerSum0.powSum(0, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        int int35 = powerSum0.powSum((int) ' ', (int) (byte) 1);
        powerSum0.Sum((int) (byte) 10, 5, (int) '4');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 396 + "'", int35 == 396);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 100, (int) (short) 10);
        int int28 = powerSum0.powSum(6, 3);
        powerSum0.Sum(3, 396, (int) ' ');
        int int35 = powerSum0.powSum(1, 586);
        powerSum0.Sum((int) '4', 6, 590);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 6 + "'", int35 == 6);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        powerSum0.Sum((int) (byte) 10, 7, (int) (short) -1);
        powerSum0.Sum((int) (short) 100, (int) (short) -1, (int) (byte) -1);
        int int21 = powerSum0.powSum(5, 397);
        int int24 = powerSum0.powSum(0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        int int13 = powerSum0.powSum((int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass14 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        powerSum0.Sum((int) (short) 100, 1, (int) '4');
        powerSum0.Sum((int) (short) 0, 5, (int) (short) 1);
        int int18 = powerSum0.powSum(398, 16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (byte) 100, 10, 3);
        int int22 = powerSum0.powSum((int) (byte) 1, 4);
        java.lang.Class<?> wildcardClass23 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) '4', 7, 2);
        int int11 = powerSum0.powSum(0, (int) (short) 0);
        powerSum0.Sum((int) (short) 100, 23, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum(5, (int) '4', 1);
        int int22 = powerSum0.powSum((int) (short) 1, 0);
        int int25 = powerSum0.powSum(3, 100);
        java.lang.Class<?> wildcardClass26 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(6, 7);
        powerSum0.Sum(390, 100, (int) 'a');
        java.lang.Class<?> wildcardClass28 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        int int6 = powerSum0.powSum((int) '4', 3);
        powerSum0.Sum((int) (byte) 10, (int) (byte) 1, 590);
        int int13 = powerSum0.powSum(586, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 1, 3);
        powerSum0.Sum(6, 398, 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        powerSum0.Sum(2, 5, 2);
        int int18 = powerSum0.powSum((int) '4', 397);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        powerSum0.Sum(590, 396, 6);
        int int15 = powerSum0.powSum(0, 16);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((int) 'a', (int) 'a');
        powerSum0.Sum((int) ' ', (int) (byte) 1, (int) (byte) 10);
        int int35 = powerSum0.powSum(10, (int) (short) 1);
        int int38 = powerSum0.powSum(397, 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 23 + "'", int35 == 23);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 23 + "'", int38 == 23);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        powerSum0.Sum((int) (byte) 10, 7, (int) (short) -1);
        powerSum0.Sum((int) (short) 100, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(586, (int) '#', 398);
        powerSum0.Sum(12, (int) '#', 10);
        powerSum0.Sum((int) (short) -1, 0, 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        int int9 = powerSum0.powSum(10, (int) (byte) 1);
        int int12 = powerSum0.powSum((int) (byte) -1, 10);
        powerSum0.Sum(6, 390, 590);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        int int16 = powerSum0.powSum(0, (int) (short) 1);
        powerSum0.Sum((int) '4', (int) ' ', (int) (byte) -1);
        int int23 = powerSum0.powSum((int) (short) 0, (int) 'a');
        int int26 = powerSum0.powSum((int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) ' ', 4, (int) (byte) 1);
        int int11 = powerSum0.powSum(5, (int) 'a');
        int int14 = powerSum0.powSum((-1), (int) (short) -1);
        powerSum0.Sum((-1), 6, 2);
        int int21 = powerSum0.powSum(11, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        powerSum0.Sum(0, (int) '4', (int) (short) 0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((int) 'a', (int) (short) 10);
        powerSum0.Sum((-1), (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum((int) (byte) -1, 2);
        powerSum0.Sum(1, (int) (byte) 1, 3);
        powerSum0.Sum(7, 2, (int) 'a');
        int int23 = powerSum0.powSum(6, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        powerSum0.Sum((int) 'a', 100, (int) (short) -1);
        int int13 = powerSum0.powSum(0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        int int19 = powerSum0.powSum((-1), (int) (short) 100);
        powerSum0.Sum((int) (byte) 10, 586, (int) '#');
        powerSum0.Sum((int) (byte) 100, (int) ' ', 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(2, 2, (int) ' ');
        int int16 = powerSum0.powSum(0, (int) (short) 1);
        powerSum0.Sum((int) '4', (int) ' ', (int) (byte) -1);
        int int23 = powerSum0.powSum(100, 2);
        int int26 = powerSum0.powSum(6, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(0, 0);
        powerSum0.Sum((-1), (int) ' ', (int) '4');
        int int17 = powerSum0.powSum((int) (short) 0, 5);
        int int20 = powerSum0.powSum(7, 398);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) (short) -1, 1);
        powerSum0.Sum((int) '#', 7, 0);
        powerSum0.Sum(12, 398, (int) (byte) -1);
        int int18 = powerSum0.powSum(1, (int) '4');
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum(396, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        int int31 = powerSum0.powSum(586, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        powerSum0.Sum((-1), 0, 590);
        int int23 = powerSum0.powSum(586, 586);
        java.lang.Class<?> wildcardClass24 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        powerSum0.Sum(100, 5, 5);
        int int19 = powerSum0.powSum(2, 6);
        int int22 = powerSum0.powSum((int) (byte) 1, (int) ' ');
        int int25 = powerSum0.powSum((int) (short) 0, 6);
        int int28 = powerSum0.powSum(7, 1);
        int int31 = powerSum0.powSum((int) (short) -1, 396);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) (short) -1, 1);
        powerSum0.Sum((int) '#', 7, 0);
        powerSum0.Sum(12, 398, (int) (byte) -1);
        powerSum0.Sum(397, 16, 586);
        java.lang.Class<?> wildcardClass20 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        int int10 = powerSum0.powSum(100, 5);
        powerSum0.Sum((int) (byte) 10, 7, (int) (short) -1);
        powerSum0.Sum((int) (short) 100, (int) (short) -1, (int) (byte) -1);
        int int21 = powerSum0.powSum((int) (short) 100, 7);
        powerSum0.Sum(4, (int) '#', (int) (short) 10);
        powerSum0.Sum(12, 11, (int) '4');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum(7, (int) ' ');
        powerSum0.Sum((int) (byte) 1, 5, 5);
        int int30 = powerSum0.powSum((int) (short) 1, 100);
        powerSum0.Sum((int) (byte) 100, 7, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        int int16 = powerSum0.powSum((int) '#', 3);
        java.lang.Class<?> wildcardClass17 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum(10, 6);
        powerSum0.Sum((int) '4', (int) '#', 0);
        powerSum0.Sum((-1), (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass28 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        int int14 = powerSum0.powSum(4, 6);
        int int17 = powerSum0.powSum(396, (int) (byte) 10);
        powerSum0.Sum(100, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum((int) (short) 0, (int) (short) -1, (int) '4');
        int int24 = powerSum0.powSum((int) ' ', 2);
        powerSum0.Sum((int) (byte) 100, 3, 3);
        int int31 = powerSum0.powSum(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass32 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 7 + "'", int31 == 7);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        powerSum0.Sum((int) ' ', 7, (int) '#');
        int int13 = powerSum0.powSum((int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 100, (int) (short) 10);
        int int28 = powerSum0.powSum(6, 3);
        int int31 = powerSum0.powSum(0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 6 + "'", int31 == 6);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) 1, (int) '#');
        int int17 = powerSum0.powSum((int) (short) 10, 398);
        int int20 = powerSum0.powSum((int) (short) 1, 390);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum(10, 5, (int) (short) -1);
        int int18 = powerSum0.powSum(586, (int) (short) 100);
        powerSum0.Sum((int) '4', 2, (int) (short) 10);
        powerSum0.Sum(6, (int) (byte) 10, 586);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum((int) '4', 3, (int) (byte) 0);
        int int18 = powerSum0.powSum(6, 7);
        java.lang.Class<?> wildcardClass19 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (short) -1, 396);
        powerSum0.Sum(1, 590, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (byte) 0, 10);
        int int14 = powerSum0.powSum((int) '#', 1);
        int int17 = powerSum0.powSum(590, 7);
        int int20 = powerSum0.powSum((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 586 + "'", int14 == 586);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 586 + "'", int17 == 586);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 587 + "'", int20 == 587);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum((int) '4', 3, (int) (byte) 0);
        int int18 = powerSum0.powSum(6, 7);
        int int21 = powerSum0.powSum(5, 586);
        powerSum0.Sum(398, 7, (int) '4');
        int int28 = powerSum0.powSum(396, 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) (short) 1, 10);
        int int14 = powerSum0.powSum(10, 12);
        int int17 = powerSum0.powSum((int) 'a', 16);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        powerSum0.Sum(396, (int) ' ', (int) '4');
        int int21 = powerSum0.powSum(0, 398);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum(0, 0, (int) (short) -1);
        int int28 = powerSum0.powSum((-1), 10);
        powerSum0.Sum((int) (short) 10, 3, 2);
        int int35 = powerSum0.powSum((int) ' ', (int) (byte) 1);
        int int38 = powerSum0.powSum(1, (int) '#');
        powerSum0.Sum((int) (byte) 0, (int) '4', (int) (byte) 1);
        powerSum0.Sum(7, (int) (byte) 100, 6);
        int int49 = powerSum0.powSum((int) '4', 6);
        java.lang.Class<?> wildcardClass50 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 396 + "'", int35 == 396);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 397 + "'", int38 == 397);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 398 + "'", int49 == 398);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 0, (int) (short) 1, (int) (short) -1);
        int int11 = powerSum0.powSum(0, 586);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        int int20 = powerSum0.powSum(16, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37 + "'", int20 == 37);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int7 = powerSum0.powSum(0, 0);
        int int10 = powerSum0.powSum((int) (byte) 1, (int) (byte) 10);
        powerSum0.Sum((int) (byte) 1, 586, 7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        int int24 = powerSum0.powSum((int) 'a', (int) '#');
        int int27 = powerSum0.powSum(100, 396);
        powerSum0.Sum(4, 398, (int) (short) 100);
        powerSum0.Sum((int) (short) 100, 5, 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) 'a', 3);
        powerSum0.Sum((int) (byte) 10, (int) ' ', 5);
        powerSum0.Sum(100, (int) ' ', (int) (byte) 0);
        powerSum0.Sum(2, 5, 2);
        int int18 = powerSum0.powSum((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        powerSum0.Sum((int) (short) 0, 4, 0);
        powerSum0.Sum((int) (byte) 0, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) 1, (int) '#');
        int int17 = powerSum0.powSum((int) (short) 10, 398);
        java.lang.Class<?> wildcardClass18 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(6, 1);
        powerSum0.Sum(1, (int) ' ', (int) 'a');
        powerSum0.Sum((int) '4', 100, (int) (short) 10);
        int int28 = powerSum0.powSum((int) '#', (int) (byte) 1);
        int int31 = powerSum0.powSum((int) (byte) -1, 396);
        powerSum0.Sum(397, (int) 'a', 396);
        java.lang.Class<?> wildcardClass36 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 590 + "'", int28 == 590);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 590 + "'", int31 == 590);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        powerSum0.Sum((int) '4', (int) ' ', 1);
        powerSum0.Sum((int) (short) 1, 10, 7);
        powerSum0.Sum((int) (short) -1, (-1), 3);
        powerSum0.Sum(6, 7, (int) '4');
        powerSum0.Sum((int) (short) 0, 396, (int) (byte) 0);
        powerSum0.Sum((int) ' ', 3, (int) 'a');
        powerSum0.Sum((int) ' ', 590, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(100, (int) '#', (int) (byte) 10);
        powerSum0.Sum(0, (int) (byte) 100, (int) (byte) 0);
        powerSum0.Sum(586, 7, 1);
        powerSum0.Sum(587, 11, 37);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum(0, (int) (byte) 0, (int) '4');
        powerSum0.Sum(586, (int) '#', (int) (byte) 100);
        powerSum0.Sum((int) (byte) -1, 6, 4);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) -1, (int) '4');
        powerSum0.Sum((int) (short) -1, (int) (byte) 1, (int) 'a');
        powerSum0.Sum(6, (int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        powerSum0.Sum(4, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum(10, (int) '#', (int) (short) 10);
        powerSum0.Sum(10, 100, (int) (byte) 10);
        powerSum0.Sum((int) '4', 5, (int) 'a');
        int int22 = powerSum0.powSum((int) (byte) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 100, 2);
        int int26 = powerSum0.powSum((int) (byte) -1, (-1));
        powerSum0.Sum(0, (int) (short) 10, 0);
        powerSum0.Sum((int) '#', 12, 398);
        java.lang.Class<?> wildcardClass35 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        powerSum0.Sum(10, 5, (int) (short) -1);
        powerSum0.Sum((int) (byte) 0, 3, (int) (byte) 1);
        powerSum0.Sum(16, 398, 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum(0, (int) (byte) 1);
        int int9 = powerSum0.powSum(10, (int) (byte) 1);
        int int12 = powerSum0.powSum((int) (byte) -1, 10);
        powerSum0.Sum(0, (int) (short) 1, (int) (short) 1);
        powerSum0.Sum(6, 7, 23);
        powerSum0.Sum((-1), 2, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }
}

