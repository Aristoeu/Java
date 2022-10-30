package stacks;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) (short) 0);
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.pop();
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.peek();
        stackArrayList0.push((-1));
        int int21 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int24 = stackArrayList0.pop();
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(7);
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(0);
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        stackArrayList0.push(35);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        stackArrayList0.push((int) '4');
        int int10 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        stackArrayList0.push(52);
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass10 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.peek();
        stackArrayList0.push(97);
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass23 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(0);
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 0);
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int23 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass24 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(4);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 10);
        int int17 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 100);
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(2);
        stackArrayList0.push((-1));
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        stackArrayList0.push((int) '4');
        stackArrayList0.push(0);
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) '#');
        stackArrayList0.push(10);
        int int21 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(0);
        stackArrayList0.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int13 = stackArrayList0.pop();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        boolean boolean18 = stackArrayList0.isEmpty();
        boolean boolean19 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.size();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        stackArrayList0.push((int) (short) 10);
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push(1);
        int int11 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int10 = stackArrayList0.pop();
        stackArrayList0.push(0);
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push(52);
        stackArrayList0.push((int) ' ');
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        stackArrayList0.push(2);
        stackArrayList0.push(4);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        boolean boolean4 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        int int10 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push(2);
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 10);
        int int13 = stackArrayList0.pop();
        stackArrayList0.push(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push(1);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push(1);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push(3);
        stackArrayList0.push(4);
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) -1);
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 1);
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(6);
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) 'a');
        stackArrayList0.push((int) (byte) 1);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.pop();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '#');
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(1);
        stackArrayList0.push(2);
        stackArrayList0.push(1);
        int int24 = stackArrayList0.pop();
        stackArrayList0.push(4);
        boolean boolean27 = stackArrayList0.isEmpty();
        int int28 = stackArrayList0.pop();
        int int29 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.pop();
        stackArrayList0.push(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) '4');
        stackArrayList0.push(4);
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        stackArrayList0.push(0);
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push((int) (short) -1);
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '#');
        stackArrayList0.push((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push(32);
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push(97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push(2);
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) 'a');
        stackArrayList0.push(100);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        stackArrayList0.push(100);
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push(3);
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push(1);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass21 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(5);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) (short) -1);
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push(1);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(32);
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(0);
        int int14 = stackArrayList0.pop();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(3);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        stackArrayList0.push(1);
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 0);
        stackArrayList0.push(52);
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.peek();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (short) -1);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) 'a');
        stackArrayList0.push(100);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        boolean boolean20 = stackArrayList0.isEmpty();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.pop();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int20 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) -1);
        java.lang.Class<?> wildcardClass23 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) 'a');
        stackArrayList0.push(100);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(0);
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        int int14 = stackArrayList0.pop();
        stackArrayList0.push(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(5);
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.size();
        boolean boolean21 = stackArrayList0.isEmpty();
        boolean boolean22 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) -1);
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        int int13 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        stackArrayList0.push(32);
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 1);
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        stackArrayList0.push(3);
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(10);
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        stackArrayList0.push((int) '4');
        int int10 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        stackArrayList0.push(52);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 10);
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(2);
        int int18 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) (short) 0);
        java.lang.Class<?> wildcardClass23 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        stackArrayList0.push(52);
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        stackArrayList0.push(100);
        stackArrayList0.push((int) ' ');
        java.lang.Class<?> wildcardClass26 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        stackArrayList0.push(2);
        int int17 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.size();
        boolean boolean22 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) 'a');
        stackArrayList0.push(100);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(0);
        int int13 = stackArrayList0.pop();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) (byte) 10);
        int int21 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(0);
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push(0);
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        stackArrayList0.push(4);
        stackArrayList0.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(32);
        int int15 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(6);
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(32);
        stackArrayList0.push(2);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        stackArrayList0.push((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.peek();
        stackArrayList0.push((int) '4');
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int23 = stackArrayList0.peek();
        int int24 = stackArrayList0.peek();
        int int25 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 10);
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(5);
        int int15 = stackArrayList0.peek();
        stackArrayList0.push(3);
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        boolean boolean20 = stackArrayList0.isEmpty();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 10);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(35);
        stackArrayList0.push(7);
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(3);
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 10);
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        stackArrayList0.push((int) (short) 10);
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) (byte) 1);
        stackArrayList0.push(2);
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push(6);
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        boolean boolean9 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push((-1));
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(1);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        int int18 = stackArrayList0.size();
        boolean boolean19 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int22 = stackArrayList0.peek();
        int int23 = stackArrayList0.peek();
        stackArrayList0.push(0);
        int int26 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(10);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push(0);
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) 'a');
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.pop();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int19 = stackArrayList0.size();
        stackArrayList0.push((-1));
        int int22 = stackArrayList0.peek();
        boolean boolean23 = stackArrayList0.isEmpty();
        boolean boolean24 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(100);
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(4);
        stackArrayList0.push(4);
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int10 = stackArrayList0.pop();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.peek();
        stackArrayList0.push((int) '4');
        int int23 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(0);
        stackArrayList0.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.pop();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(3);
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        stackArrayList0.push((int) (short) -1);
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        stackArrayList0.push(10);
        stackArrayList0.push((int) '#');
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(2);
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(0);
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '#');
        stackArrayList0.push((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(5);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) -1);
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 10);
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        stackArrayList0.push((int) '4');
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int18 = stackArrayList0.peek();
        stackArrayList0.push((int) ' ');
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(10);
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(2);
        int int18 = stackArrayList0.peek();
        stackArrayList0.push(100);
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        stackArrayList0.push(2);
        stackArrayList0.push(97);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.size();
        stackArrayList0.push(1);
        boolean boolean19 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(1);
        stackArrayList0.push(2);
        stackArrayList0.push(1);
        int int24 = stackArrayList0.pop();
        stackArrayList0.push(4);
        int int27 = stackArrayList0.pop();
        stackArrayList0.push(97);
        stackArrayList0.push((int) (short) -1);
        int int32 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        stackArrayList0.push(8);
        int int13 = stackArrayList0.peek();
        stackArrayList0.push((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        stackArrayList0.push(0);
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int19 = stackArrayList0.size();
        stackArrayList0.push((-1));
        int int22 = stackArrayList0.peek();
        boolean boolean23 = stackArrayList0.isEmpty();
        int int24 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        boolean boolean5 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        stackArrayList0.push(7);
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push(32);
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(3);
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 0);
        int int15 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(32);
        stackArrayList0.push(6);
        stackArrayList0.push(4);
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) ' ');
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        stackArrayList0.push(5);
        int int17 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push((int) '4');
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int10 = stackArrayList0.pop();
        stackArrayList0.push(0);
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.peek();
        stackArrayList0.push(6);
        boolean boolean21 = stackArrayList0.isEmpty();
        int int22 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push(100);
        int int14 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push(7);
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass21 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(10);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(32);
        int int13 = stackArrayList0.size();
        stackArrayList0.push(0);
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.pop();
        stackArrayList0.push((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int7 = stackArrayList0.pop();
        boolean boolean8 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) '#');
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) 'a');
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(2);
        int int11 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        stackArrayList0.push(1);
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push(1);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(2);
        stackArrayList0.push(1);
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.size();
        boolean boolean21 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        int int24 = stackArrayList0.peek();
        int int25 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push((-1));
        stackArrayList0.push(32);
        int int16 = stackArrayList0.pop();
        stackArrayList0.push(5);
        stackArrayList0.push((int) '#');
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(32);
        stackArrayList0.push(3);
        int int17 = stackArrayList0.peek();
        stackArrayList0.push((-1));
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push(7);
        int int21 = stackArrayList0.peek();
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(32);
        int int13 = stackArrayList0.size();
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push(5);
        stackArrayList0.push((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 10);
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.size();
        boolean boolean22 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int25 = stackArrayList0.pop();
        int int26 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        int int29 = stackArrayList0.peek();
        int int30 = stackArrayList0.pop();
        boolean boolean31 = stackArrayList0.isEmpty();
        int int32 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(1);
        stackArrayList0.push(2);
        stackArrayList0.push(1);
        int int24 = stackArrayList0.pop();
        stackArrayList0.push(4);
        boolean boolean27 = stackArrayList0.isEmpty();
        boolean boolean28 = stackArrayList0.isEmpty();
        int int29 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.peek();
        stackArrayList0.push(52);
        int int11 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int20 = stackArrayList0.size();
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(4);
        stackArrayList0.push((int) (short) 10);
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        stackArrayList0.push(100);
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.pop();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 1);
        int int23 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(0);
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.peek();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        int int18 = stackArrayList0.size();
        boolean boolean19 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int22 = stackArrayList0.peek();
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.size();
        boolean boolean21 = stackArrayList0.isEmpty();
        boolean boolean22 = stackArrayList0.isEmpty();
        int int23 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        int int26 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) (byte) 1);
        stackArrayList0.push(2);
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(0);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 1);
        int int22 = stackArrayList0.peek();
        int int23 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }
}

