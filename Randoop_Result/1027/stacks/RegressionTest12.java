package stacks;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push(32);
        stackArrayList0.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.pop();
        stackArrayList0.push(32);
        int int18 = stackArrayList0.peek();
        boolean boolean19 = stackArrayList0.isEmpty();
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push((int) (byte) -1);
        int int12 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push((int) (short) 10);
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
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
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
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
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(32);
        boolean boolean10 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(10);
        int int12 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        boolean boolean20 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        boolean boolean23 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
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
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
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
        stackArrayList0.push(35);
        stackArrayList0.push((int) (byte) 0);
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(0);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(6);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
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
        int int17 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
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
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push(100);
        int int20 = stackArrayList0.size();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
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
        stackArrayList0.push(5);
        boolean boolean23 = stackArrayList0.isEmpty();
        int int24 = stackArrayList0.size();
        int int25 = stackArrayList0.peek();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push(7);
        stackArrayList0.push((int) (short) -1);
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
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
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
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
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(52);
        int int25 = stackArrayList0.peek();
        int int26 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 52 + "'", int26 == 52);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
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
        stackArrayList0.push((int) 'a');
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
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
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        stackArrayList0.push(3);
        int int17 = stackArrayList0.peek();
        stackArrayList0.push(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
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
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.peek();
        boolean boolean19 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int10 = stackArrayList0.pop();
        stackArrayList0.push(0);
        int int13 = stackArrayList0.size();
        stackArrayList0.push((int) (short) -1);
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(0);
        int int13 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 10);
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.peek();
        stackArrayList0.push(10);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
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
        stackArrayList0.push(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
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
        int int17 = stackArrayList0.size();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(3);
        stackArrayList0.push(32);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
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
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.peek();
        stackArrayList0.push(2);
        int int11 = stackArrayList0.pop();
        stackArrayList0.push(52);
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
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
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push(7);
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
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
        boolean boolean21 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
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
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.peek();
        stackArrayList0.push(100);
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
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
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(4);
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(1);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        boolean boolean10 = stackArrayList0.isEmpty();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(0);
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(97);
        stackArrayList0.push((int) (byte) 1);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
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
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 0);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        int int15 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 1);
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
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
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        stackArrayList0.push((int) 'a');
        boolean boolean19 = stackArrayList0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean10 = stackArrayList0.isEmpty();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.pop();
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        stackArrayList0.push(100);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
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
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push(52);
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
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
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
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
        stackArrayList0.push(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        stackArrayList0.push(0);
        java.lang.Class<?> wildcardClass12 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
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
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
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
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
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
        int int17 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
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
        stackArrayList0.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) -1);
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push(100);
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.peek();
        boolean boolean21 = stackArrayList0.isEmpty();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.size();
        int int24 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
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
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.pop();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 10);
        int int14 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push(0);
        int int6 = stackArrayList0.peek();
        stackArrayList0.push(4);
        int int9 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
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
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.peek();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        stackArrayList0.push(32);
        boolean boolean24 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        int int27 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.pop();
        stackArrayList0.push(3);
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
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
        stackArrayList0.push((int) ' ');
        boolean boolean22 = stackArrayList0.isEmpty();
        int int23 = stackArrayList0.peek();
        int int24 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
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
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(1);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 1);
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
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
        int int16 = stackArrayList0.pop();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.pop();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
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
        stackArrayList0.push((-1));
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(6);
        int int20 = stackArrayList0.pop();
        boolean boolean21 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
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
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(100);
        int int20 = stackArrayList0.size();
        boolean boolean21 = stackArrayList0.isEmpty();
        boolean boolean22 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(2);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        stackArrayList0.push(4);
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(4);
        stackArrayList0.push((int) '#');
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
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
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) 'a');
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
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
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
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
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.size();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
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
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push(97);
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
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
        int int18 = stackArrayList0.peek();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(97);
        int int10 = stackArrayList0.size();
        stackArrayList0.push(6);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.pop();
        stackArrayList0.push((-1));
        int int22 = stackArrayList0.size();
        boolean boolean23 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
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
        stackArrayList0.push((int) (short) 0);
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 0);
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        stackArrayList0.push(100);
        stackArrayList0.push((int) (short) 1);
        int int22 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
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
        stackArrayList0.push(0);
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
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
        int int16 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 1);
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
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
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
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
        stackArrayList0.push((int) 'a');
        stackArrayList0.push((-1));
        java.lang.Class<?> wildcardClass24 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
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
        int int20 = stackArrayList0.peek();
        boolean boolean21 = stackArrayList0.isEmpty();
        boolean boolean22 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass23 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
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
        stackArrayList0.push(0);
        stackArrayList0.push(0);
        boolean boolean22 = stackArrayList0.isEmpty();
        int int23 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
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
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
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
        stackArrayList0.push(32);
        boolean boolean22 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
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
        int int15 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
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
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(3);
        int int15 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int18 = stackArrayList0.pop();
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        stackArrayList0.push((-1));
        int int11 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
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
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(97);
        boolean boolean10 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
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
        stackArrayList0.push((int) (short) 0);
        int int16 = stackArrayList0.size();
        stackArrayList0.push(7);
        int int19 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
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
        stackArrayList0.push(97);
        int int16 = stackArrayList0.pop();
        stackArrayList0.push((int) '#');
        stackArrayList0.push((-1));
        int int21 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int24 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        boolean boolean10 = stackArrayList0.isEmpty();
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push(100);
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
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
        stackArrayList0.push((int) (byte) 1);
        int int19 = stackArrayList0.peek();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (short) -1);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
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
        stackArrayList0.push((int) (byte) 1);
        int int19 = stackArrayList0.peek();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.peek();
        boolean boolean24 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(35);
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) ' ');
        int int12 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(35);
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
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
        stackArrayList0.push((-1));
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        int int21 = stackArrayList0.size();
        stackArrayList0.push(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
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
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) ' ');
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
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
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.pop();
        stackArrayList0.push(6);
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
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
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push((int) 'a');
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
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
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 0);
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
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
        stackArrayList0.push(97);
        int int18 = stackArrayList0.size();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.pop();
        stackArrayList0.push(0);
        boolean boolean24 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
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
        stackArrayList0.push((int) '4');
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
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
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        stackArrayList0.push(100);
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(97);
        int int10 = stackArrayList0.size();
        stackArrayList0.push(6);
        int int13 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.peek();
        stackArrayList0.push(10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
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
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.peek();
        stackArrayList0.push(8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(35);
        int int15 = stackArrayList0.size();
        stackArrayList0.push(3);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
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
        int int19 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
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
        int int15 = stackArrayList0.peek();
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
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
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (short) 100);
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
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
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
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
        stackArrayList0.push((int) (short) 1);
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        boolean boolean20 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
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
        boolean boolean13 = stackArrayList0.isEmpty();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
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
        stackArrayList0.push((int) (short) 1);
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
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
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
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
        stackArrayList0.push((int) (short) 10);
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
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
        stackArrayList0.push((int) (short) 100);
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
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
        int int19 = stackArrayList0.peek();
        stackArrayList0.push((int) ' ');
        int int22 = stackArrayList0.size();
        boolean boolean23 = stackArrayList0.isEmpty();
        int int24 = stackArrayList0.peek();
        boolean boolean25 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
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
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int23 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        boolean boolean14 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
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
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
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
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push((int) (byte) -1);
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) -1);
        int int10 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
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
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
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
        boolean boolean19 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) ' ');
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.peek();
        stackArrayList0.push(6);
        int int24 = stackArrayList0.pop();
        boolean boolean25 = stackArrayList0.isEmpty();
        int int26 = stackArrayList0.size();
        boolean boolean27 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
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
        stackArrayList0.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        boolean boolean10 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
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
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) -1);
        int int13 = stackArrayList0.size();
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
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
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(35);
        stackArrayList0.push(6);
        int int16 = stackArrayList0.size();
        stackArrayList0.push(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
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
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        boolean boolean19 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
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
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.size();
        stackArrayList0.push(6);
        boolean boolean23 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
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
        stackArrayList0.push((int) (byte) 1);
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.size();
        boolean boolean22 = stackArrayList0.isEmpty();
        int int23 = stackArrayList0.pop();
        boolean boolean24 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
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
        int int14 = stackArrayList0.pop();
        stackArrayList0.push((-1));
        stackArrayList0.push(0);
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
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
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        stackArrayList0.push(4);
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push(2);
        int int9 = stackArrayList0.size();
        boolean boolean10 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
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
        int int13 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
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
        stackArrayList0.push(2);
        int int19 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
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
        stackArrayList0.push(52);
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
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
        int int22 = stackArrayList0.pop();
        boolean boolean23 = stackArrayList0.isEmpty();
        boolean boolean24 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
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
        stackArrayList0.push((int) '4');
        int int24 = stackArrayList0.peek();
        boolean boolean25 = stackArrayList0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.peek();
        stackArrayList0.push(10);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
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
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        boolean boolean6 = stackArrayList0.isEmpty();
        stackArrayList0.push(5);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
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
        stackArrayList0.push(5);
        stackArrayList0.push(100);
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
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
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
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
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
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
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push(35);
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push(2);
        stackArrayList0.push(35);
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(35);
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        boolean boolean13 = stackArrayList0.isEmpty();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.peek();
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
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
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push(3);
        int int23 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        stackArrayList0.push((int) '4');
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        boolean boolean13 = stackArrayList0.isEmpty();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
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
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
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
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
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
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.size();
        stackArrayList0.push(5);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(5);
        boolean boolean14 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
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
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.peek();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.peek();
        boolean boolean10 = stackArrayList0.isEmpty();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
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
        stackArrayList0.push(1);
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
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
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass6 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(10);
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
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
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.size();
        boolean boolean24 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push(100);
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        stackArrayList0.push(2);
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
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
        int int16 = stackArrayList0.peek();
        stackArrayList0.push((-1));
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.size();
        boolean boolean22 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        boolean boolean14 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push((int) (byte) -1);
        int int12 = stackArrayList0.peek();
        stackArrayList0.push(10);
        stackArrayList0.push((int) (byte) -1);
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push(2);
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 1);
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
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
        stackArrayList0.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        stackArrayList0.push((int) '#');
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        stackArrayList0.push((int) (byte) 1);
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
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
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.pop();
        boolean boolean19 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
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
        boolean boolean23 = stackArrayList0.isEmpty();
        int int24 = stackArrayList0.pop();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        stackArrayList0.push((int) '4');
        stackArrayList0.push(0);
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
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
        int int19 = stackArrayList0.peek();
        stackArrayList0.push((int) ' ');
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
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
        int int15 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(97);
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
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
        stackArrayList0.push(1);
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) -1);
        int int24 = stackArrayList0.pop();
        int int25 = stackArrayList0.peek();
        int int26 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 10);
        boolean boolean12 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
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
        int int14 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
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
        int int18 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) 'a');
        int int14 = stackArrayList0.pop();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
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
        stackArrayList0.push(97);
        int int16 = stackArrayList0.pop();
        stackArrayList0.push((int) '#');
        stackArrayList0.push((-1));
        int int21 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int24 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
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
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        stackArrayList0.push(100);
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
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
        int int15 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 10);
        stackArrayList0.push((int) (byte) -1);
        int int20 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        boolean boolean10 = stackArrayList0.isEmpty();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        stackArrayList0.push(4);
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push(35);
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push(52);
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.peek();
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '#');
        int int13 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(0);
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
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
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
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
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        stackArrayList0.push((int) ' ');
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        stackArrayList0.push(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
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
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(4);
        stackArrayList0.push((int) '#');
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.peek();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.peek();
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
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
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 0);
        int int16 = stackArrayList0.pop();
        stackArrayList0.push(1);
        boolean boolean19 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
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
        stackArrayList0.push((int) (byte) 10);
        stackArrayList0.push((int) (byte) 0);
        int int22 = stackArrayList0.pop();
        boolean boolean23 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.peek();
        stackArrayList0.push(6);
        stackArrayList0.push(9);
        int int26 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = stackArrayList0.pop();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
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
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.peek();
        int int23 = stackArrayList0.size();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass10 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
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
        stackArrayList0.push(97);
        int int18 = stackArrayList0.size();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.pop();
        stackArrayList0.push(0);
        java.lang.Class<?> wildcardClass24 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) 'a');
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
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
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
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
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.pop();
        stackArrayList0.push(1);
        java.lang.Class<?> wildcardClass23 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
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
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push(3);
        boolean boolean21 = stackArrayList0.isEmpty();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.peek();
        boolean boolean24 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(7);
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
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
        stackArrayList0.push(2);
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push(100);
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
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
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass21 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
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
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        stackArrayList0.push(7);
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(0);
        int int13 = stackArrayList0.peek();
        stackArrayList0.push(2);
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
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
        int int20 = stackArrayList0.pop();
        boolean boolean21 = stackArrayList0.isEmpty();
        int int22 = stackArrayList0.pop();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
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
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        int int16 = stackArrayList0.size();
        stackArrayList0.push((int) (short) -1);
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) ' ');
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
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
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.size();
        stackArrayList0.push(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
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
        int int27 = stackArrayList0.peek();
        boolean boolean28 = stackArrayList0.isEmpty();
        int int29 = stackArrayList0.peek();
        int int30 = stackArrayList0.peek();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
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
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (short) 100);
        boolean boolean20 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        int int23 = stackArrayList0.peek();
        int int24 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
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
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.peek();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
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
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.pop();
        boolean boolean19 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.pop();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
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
        stackArrayList0.push((int) (short) 10);
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        stackArrayList0.push(100);
        boolean boolean21 = stackArrayList0.isEmpty();
        int int22 = stackArrayList0.peek();
        stackArrayList0.push(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
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
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        stackArrayList0.push(6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
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
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) '4');
        int int17 = stackArrayList0.size();
        boolean boolean18 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push((-1));
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
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
        stackArrayList0.push((int) (short) 1);
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        boolean boolean19 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean22 = stackArrayList0.isEmpty();
        stackArrayList0.push(1);
        int int25 = stackArrayList0.size();
        int int26 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
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
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push(35);
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
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
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        stackArrayList0.push((-1));
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
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
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(0);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.size();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(1);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(5);
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
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
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
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
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        boolean boolean9 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass10 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
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
        int int18 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
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
        stackArrayList0.push(32);
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
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
        stackArrayList0.push(2);
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push(100);
        int int21 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
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
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
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
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
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
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.peek();
        stackArrayList0.push(0);
        stackArrayList0.push((int) (byte) 0);
        int int24 = stackArrayList0.peek();
        boolean boolean25 = stackArrayList0.isEmpty();
        int int26 = stackArrayList0.pop();
        int int27 = stackArrayList0.size();
        int int28 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
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
        stackArrayList0.push((int) 'a');
        int int16 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 0);
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int10 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 1);
        stackArrayList0.push(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
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
        stackArrayList0.push((int) (short) 100);
        int int18 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        stackArrayList0.push((int) '4');
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push(10);
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push(6);
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
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
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.size();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(3);
        stackArrayList0.push((-1));
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
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
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push(97);
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
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
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) '#');
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        int int13 = stackArrayList0.size();
        stackArrayList0.push(1);
        int int16 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        boolean boolean19 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
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
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.peek();
        boolean boolean20 = stackArrayList0.isEmpty();
        stackArrayList0.push(7);
        boolean boolean23 = stackArrayList0.isEmpty();
        int int24 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
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
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(10);
        int int22 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
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
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.pop();
        boolean boolean22 = stackArrayList0.isEmpty();
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
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
        stackArrayList0.push(1);
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 100);
        int int26 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push(7);
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
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
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
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
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.pop();
        boolean boolean22 = stackArrayList0.isEmpty();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
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
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 1);
        boolean boolean16 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
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
        stackArrayList0.push(97);
        stackArrayList0.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
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
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
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
        stackArrayList0.push((int) (short) -1);
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 1);
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        boolean boolean5 = stackArrayList0.isEmpty();
        boolean boolean6 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        boolean boolean9 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
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
        stackArrayList0.push((int) (byte) 10);
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push(1);
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
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
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
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
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.pop();
        int int24 = stackArrayList0.pop();
        int int25 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
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
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.peek();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 0);
        int int24 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
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
        stackArrayList0.push((int) (short) 0);
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        boolean boolean5 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        boolean boolean8 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
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
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int26 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 0);
        int int29 = stackArrayList0.pop();
        int int30 = stackArrayList0.size();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
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
        java.lang.Class<?> wildcardClass21 = stackArrayList0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
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
        boolean boolean21 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(8);
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.size();
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
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
        stackArrayList0.push(52);
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.pop();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
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
        int int16 = stackArrayList0.pop();
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        stackArrayList0.push((int) '#');
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
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
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
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
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
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
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
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
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
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
        stackArrayList0.push(5);
        int int17 = stackArrayList0.pop();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
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
        stackArrayList0.push(7);
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
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
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
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
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass10 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 0);
        int int4 = stackArrayList0.pop();
        boolean boolean5 = stackArrayList0.isEmpty();
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(1);
        stackArrayList0.push(97);
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        boolean boolean5 = stackArrayList0.isEmpty();
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(2);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        stackArrayList0.push(4);
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.peek();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
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
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.peek();
        boolean boolean22 = stackArrayList0.isEmpty();
        int int23 = stackArrayList0.peek();
        boolean boolean24 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 100);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
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
        stackArrayList0.push((int) 'a');
        stackArrayList0.push((-1));
        int int24 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
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
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
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
        int int16 = stackArrayList0.peek();
        stackArrayList0.push(2);
        boolean boolean19 = stackArrayList0.isEmpty();
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
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
        stackArrayList0.push((int) '4');
        stackArrayList0.push((int) '#');
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        int int11 = stackArrayList0.pop();
        stackArrayList0.push(0);
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
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
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(2);
        int int13 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(2);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        stackArrayList0.push(1);
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
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
        int int17 = stackArrayList0.size();
        stackArrayList0.push((int) (short) -1);
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) 'a');
        stackArrayList0.push((int) ' ');
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
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
        stackArrayList0.push((int) '4');
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) -1);
        int int12 = stackArrayList0.peek();
        stackArrayList0.push(5);
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 10);
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) ' ');
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
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
        stackArrayList0.push((int) '#');
        int int20 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
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
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) ' ');
        boolean boolean21 = stackArrayList0.isEmpty();
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.size();
        int int24 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
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
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.pop();
        boolean boolean10 = stackArrayList0.isEmpty();
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(3);
        int int15 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int18 = stackArrayList0.pop();
        boolean boolean19 = stackArrayList0.isEmpty();
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
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
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((-1));
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
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
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        stackArrayList0.push(1);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
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
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.pop();
        stackArrayList0.push(5);
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(35);
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) 'a');
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(97);
        int int10 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        stackArrayList0.push((int) (byte) 1);
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
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
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(5);
        stackArrayList0.push(1);
        stackArrayList0.push(2);
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(52);
        int int23 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) '4');
        stackArrayList0.push(6);
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        stackArrayList0.push(6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) 'a');
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.pop();
        stackArrayList0.push(2);
        int int13 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
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
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(7);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
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
        stackArrayList0.push((int) (byte) 10);
        int int19 = stackArrayList0.size();
        stackArrayList0.push(6);
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
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
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.peek();
        stackArrayList0.push(0);
        int int22 = stackArrayList0.peek();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) -1);
        int int15 = stackArrayList0.size();
        stackArrayList0.push(2);
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
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
        int int15 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
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
        stackArrayList0.push(5);
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
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
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 10);
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(97);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) -1);
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
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
        stackArrayList0.push((int) (byte) 1);
        stackArrayList0.push(100);
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int4 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(35);
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
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
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        int int20 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
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
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.size();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(3);
        stackArrayList0.push(32);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        int int15 = stackArrayList0.pop();
        stackArrayList0.push(97);
        int int18 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        boolean boolean10 = stackArrayList0.isEmpty();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
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
        stackArrayList0.push(52);
        stackArrayList0.push((int) ' ');
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
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
        int int13 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
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
        stackArrayList0.push(2);
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(0);
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(35);
        int int13 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 1);
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) '4');
        stackArrayList0.push(4);
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
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
        stackArrayList0.push((int) (short) 1);
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        boolean boolean19 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 100);
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(3);
        stackArrayList0.push((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
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
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        int int16 = stackArrayList0.pop();
        stackArrayList0.push(3);
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) -1);
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
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
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }
}

