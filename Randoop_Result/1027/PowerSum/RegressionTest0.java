package PowerSum;

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
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        java.lang.Class<?> wildcardClass1 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass5 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(1, 0);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass4 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        java.lang.Class<?> wildcardClass12 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '#', (int) (short) 1, (int) 'a');
        powerSum0.Sum((int) (byte) 10, (int) 'a', (int) '4');
        powerSum0.Sum((int) (short) -1, (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass5 = powerSum0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (short) 0, 1, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum(0, (int) (byte) 10);
        int int14 = powerSum0.powSum((int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((-1), 0);
        powerSum0.Sum(10, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass8 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 345859 + "'", int23 == 345859);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum((int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) (short) -1, 1);
        powerSum0.Sum((int) (short) -1, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum((int) (short) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum(6, 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        int int19 = powerSum0.powSum(10, 6);
        powerSum0.Sum((int) (byte) -1, (int) ' ', 444796);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 1, (int) (short) 10, 3);
        powerSum0.Sum((int) (short) -1, (int) (byte) 10, (int) (byte) -1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        int int6 = powerSum0.powSum((int) (byte) 1, (int) (byte) 100);
        int int9 = powerSum0.powSum(10, (int) ' ');
        int int12 = powerSum0.powSum(5, (int) (short) 10);
        int int15 = powerSum0.powSum(10, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        int int7 = powerSum0.powSum((int) (short) -1, 1);
        powerSum0.Sum((-1), 345859, 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        int int11 = powerSum0.powSum((int) '#', 100);
        int int14 = powerSum0.powSum(0, (int) '4');
        int int17 = powerSum0.powSum(2, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum((int) (byte) 1, 6, (-1));
        powerSum0.Sum((int) (byte) 0, (int) (byte) 0, (int) (byte) 100);
        powerSum0.Sum((-1), (int) '#', (int) '#');
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        int int3 = powerSum0.powSum((int) (byte) 0, (int) 'a');
        powerSum0.Sum((int) (short) 100, 100, 10);
        powerSum0.Sum((int) (byte) 10, (int) ' ', (int) (short) 1);
        powerSum0.Sum(100, 3, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        int int15 = powerSum0.powSum((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass16 = powerSum0.getClass();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        com.thealgorithms.backtracking.PowerSum powerSum0 = new com.thealgorithms.backtracking.PowerSum();
        powerSum0.Sum((int) '4', (int) (byte) 1, (int) (short) 100);
        powerSum0.Sum(1, (int) (short) -1, (int) (byte) -1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 0);
        powerSum0.Sum((int) (short) 0, (int) ' ', (int) '#');
        powerSum0.Sum((int) (short) 1, 0, (int) ' ');
        int int23 = powerSum0.powSum((int) (short) 100, 1);
        powerSum0.Sum(0, (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 444796 + "'", int23 == 444796);
    }
}

