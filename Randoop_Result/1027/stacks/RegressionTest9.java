package stacks;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.pop();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(100);
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        stackArrayList0.push((int) 'a');
        int int16 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int4 = stackArrayList0.pop();
        boolean boolean5 = stackArrayList0.isEmpty();
        boolean boolean6 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        int int9 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass10 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int4 = stackArrayList0.pop();
        boolean boolean5 = stackArrayList0.isEmpty();
        boolean boolean6 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        boolean boolean9 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        stackArrayList0.push(4);
        int int8 = stackArrayList0.peek();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
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
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        int int13 = stackArrayList0.pop();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int10 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(1);
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push((-1));
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 10);
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        int int14 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (short) -1);
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
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
        stackArrayList0.push((int) (byte) 1);
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(100);
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.peek();
        stackArrayList0.push(10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(52);
        stackArrayList0.push(0);
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        stackArrayList0.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        stackArrayList0.push((-1));
        int int13 = stackArrayList0.pop();
        boolean boolean14 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.size();
        stackArrayList0.push(97);
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
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
        stackArrayList0.push(0);
        int int20 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        boolean boolean6 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(8);
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int8 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) -1);
        int int12 = stackArrayList0.pop();
        stackArrayList0.push((-1));
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        stackArrayList0.push(97);
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        stackArrayList0.push(0);
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push(3);
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
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
        stackArrayList0.push(97);
        int int23 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        stackArrayList0.push(7);
        stackArrayList0.push(1);
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        boolean boolean4 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 100);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int11 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
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
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
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
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        stackArrayList0.push(4);
        int int20 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.size();
        stackArrayList0.push((-1));
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push(2);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.peek();
        stackArrayList0.push(10);
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        stackArrayList0.push((int) (short) 100);
        int int14 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
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
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        stackArrayList0.push((int) '4');
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 10);
        int int13 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 1);
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
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
        stackArrayList0.push((int) '#');
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.pop();
        boolean boolean6 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass7 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(2);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) (short) 0);
        int int14 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
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
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.size();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        java.lang.Class<?> wildcardClass12 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        stackArrayList0.push((int) (short) 100);
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(2);
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
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
        int int15 = stackArrayList0.pop();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.peek();
        stackArrayList0.push(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
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
        stackArrayList0.push(32);
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
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
        stackArrayList0.push(0);
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        stackArrayList0.push(4);
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
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
        stackArrayList0.push(10);
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
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
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        stackArrayList0.push((int) '#');
        int int15 = stackArrayList0.peek();
        stackArrayList0.push(4);
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.size();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
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
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        stackArrayList0.push(7);
        stackArrayList0.push(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
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
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int23 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
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
        stackArrayList0.push(2);
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        stackArrayList0.push(97);
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
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
        stackArrayList0.push(4);
        int int18 = stackArrayList0.size();
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        stackArrayList0.push(35);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
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
        stackArrayList0.push((int) (byte) 1);
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.size();
        stackArrayList0.push(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
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
        int int24 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
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
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        stackArrayList0.push((int) '4');
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        int int20 = stackArrayList0.peek();
        boolean boolean21 = stackArrayList0.isEmpty();
        int int22 = stackArrayList0.size();
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        int int14 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push(1);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
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
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 10);
        stackArrayList0.push((int) (short) 0);
        int int16 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 0);
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(4);
        stackArrayList0.push((int) (byte) 0);
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        int int4 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        boolean boolean2 = stackArrayList0.isEmpty();
        int int3 = stackArrayList0.size();
        boolean boolean4 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) 'a');
        boolean boolean10 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
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
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
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
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
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
        int int17 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int24 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
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
        int int15 = stackArrayList0.pop();
        stackArrayList0.push(8);
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int10 = stackArrayList0.size();
        stackArrayList0.push(8);
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
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
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        stackArrayList0.push(5);
        stackArrayList0.push(8);
        stackArrayList0.push((int) (byte) 1);
        stackArrayList0.push((int) 'a');
        boolean boolean28 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        stackArrayList0.push(0);
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
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
        int int22 = stackArrayList0.size();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
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
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
        stackArrayList0.push(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.pop();
        boolean boolean10 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.peek();
        stackArrayList0.push(0);
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push(32);
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
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
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int4 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
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
        stackArrayList0.push((int) ' ');
        int int25 = stackArrayList0.peek();
        int int26 = stackArrayList0.size();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
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
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        int int23 = stackArrayList0.size();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push(32);
        boolean boolean10 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
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
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.pop();
        boolean boolean23 = stackArrayList0.isEmpty();
        int int24 = stackArrayList0.peek();
        boolean boolean25 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int10 = stackArrayList0.size();
        stackArrayList0.push((int) 'a');
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
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
        int int20 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass21 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
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
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
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
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(7);
        stackArrayList0.push(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
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
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) ' ');
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int8 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(2);
        stackArrayList0.push((-1));
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push((int) 'a');
        stackArrayList0.push(3);
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
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
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
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
        java.lang.Class<?> wildcardClass21 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.peek();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push(32);
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
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
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        stackArrayList0.push((int) 'a');
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) '#');
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        int int14 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) '4');
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
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
        int int16 = stackArrayList0.peek();
        stackArrayList0.push(10);
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 100);
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
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
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.pop();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.size();
        boolean boolean21 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int24 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass25 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '#');
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass8 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.size();
        stackArrayList0.push(3);
        int int10 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        stackArrayList0.push(6);
        int int25 = stackArrayList0.peek();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
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
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
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
        stackArrayList0.push((int) (byte) 1);
        int int17 = stackArrayList0.size();
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int21 = stackArrayList0.peek();
        int int22 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
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
        int int13 = stackArrayList0.pop();
        boolean boolean14 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
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
        stackArrayList0.push((int) (short) 0);
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        boolean boolean5 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
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
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(6);
        int int24 = stackArrayList0.peek();
        boolean boolean25 = stackArrayList0.isEmpty();
        int int26 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass27 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass10 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
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
        stackArrayList0.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
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
        stackArrayList0.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
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
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
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
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean23 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        boolean boolean5 = stackArrayList0.isEmpty();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(6);
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
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
        boolean boolean29 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
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
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        stackArrayList0.push(32);
        boolean boolean21 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        int int10 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
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
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
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
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.peek();
        stackArrayList0.push(8);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
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
        stackArrayList0.push((int) (byte) 0);
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        stackArrayList0.push(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 10);
        stackArrayList0.push((int) (short) 0);
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
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
        stackArrayList0.push((int) (byte) 1);
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
        int int21 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
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
        int int22 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass23 = stackArrayList0.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
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
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
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
        stackArrayList0.push(4);
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(4);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
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
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '#');
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        stackArrayList0.push((int) '4');
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
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
        stackArrayList0.push(7);
        stackArrayList0.push(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
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
        stackArrayList0.push(0);
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
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
        int int15 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        stackArrayList0.push(8);
        stackArrayList0.push(6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
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
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
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
        boolean boolean19 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
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
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
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
        stackArrayList0.push((int) (byte) -1);
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass24 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
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
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
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
        int int19 = stackArrayList0.peek();
        stackArrayList0.push((-1));
        int int22 = stackArrayList0.size();
        boolean boolean23 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
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
        stackArrayList0.push(97);
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass21 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
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
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
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
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push(6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        boolean boolean17 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
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
        int int29 = stackArrayList0.size();
        int int30 = stackArrayList0.pop();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6 + "'", int29 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(0);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
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
        stackArrayList0.push((int) (byte) 1);
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.pop();
        stackArrayList0.push((-1));
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
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
        int int15 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
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
        stackArrayList0.push(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
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
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        stackArrayList0.push(100);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 1);
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
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
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        stackArrayList0.push((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
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
        stackArrayList0.push((int) (byte) 1);
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push(0);
        stackArrayList0.push(3);
        stackArrayList0.push(97);
        int int21 = stackArrayList0.pop();
        stackArrayList0.push((int) '4');
        int int24 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 100);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(52);
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 0);
        int int15 = stackArrayList0.size();
        stackArrayList0.push(0);
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(2);
        stackArrayList0.push((-1));
        int int12 = stackArrayList0.peek();
        stackArrayList0.push(4);
        boolean boolean15 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
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
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        stackArrayList0.push((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        stackArrayList0.push(32);
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
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
        stackArrayList0.push(6);
        stackArrayList0.push(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
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
        java.lang.Class<?> wildcardClass23 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
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
        int int13 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
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
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(6);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass9 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
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
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
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
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.size();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
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
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.pop();
        stackArrayList0.push((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        stackArrayList0.push(32);
        stackArrayList0.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
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
        stackArrayList0.push((int) (byte) 1);
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.peek();
        int int24 = stackArrayList0.pop();
        int int25 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass26 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
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
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
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
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (short) 10);
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
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
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
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
        int int18 = stackArrayList0.peek();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.peek();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
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
        stackArrayList0.push((int) (byte) 1);
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
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
        stackArrayList0.push((int) (short) 100);
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push((-1));
        int int14 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 10);
        int int17 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
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
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
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
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
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
        int int22 = stackArrayList0.peek();
        stackArrayList0.push(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
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
        boolean boolean22 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
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
        int int18 = stackArrayList0.pop();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(35);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
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
        int int24 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        stackArrayList0.push((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
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
        boolean boolean24 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        java.lang.Class<?> wildcardClass27 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
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
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        boolean boolean6 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(8);
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
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
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
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
        stackArrayList0.push((int) (short) 0);
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
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
        int int17 = stackArrayList0.peek();
        stackArrayList0.push(7);
        boolean boolean20 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
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
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push(0);
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(3);
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
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
        stackArrayList0.push(10);
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        boolean boolean22 = stackArrayList0.isEmpty();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        stackArrayList0.push(10);
        boolean boolean12 = stackArrayList0.isEmpty();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(4);
        stackArrayList0.push((int) (byte) 0);
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
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
        stackArrayList0.push((int) (byte) 1);
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
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
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.peek();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
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
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(35);
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
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
        stackArrayList0.push((-1));
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
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
        int int18 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        stackArrayList0.push(3);
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
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
        stackArrayList0.push(1);
        stackArrayList0.push((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
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
        int int23 = stackArrayList0.pop();
        int int24 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass25 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
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
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.pop();
        boolean boolean23 = stackArrayList0.isEmpty();
        int int24 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
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
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.peek();
        int int6 = stackArrayList0.size();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push(35);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass9 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
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
        int int15 = stackArrayList0.size();
        stackArrayList0.push(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
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
        stackArrayList0.push((int) 'a');
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int10 = stackArrayList0.pop();
        stackArrayList0.push(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) '4');
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass10 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
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
        stackArrayList0.push((int) (byte) 10);
        int int16 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass17 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
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
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        stackArrayList0.push(32);
        stackArrayList0.push(32);
        int int25 = stackArrayList0.pop();
        int int26 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
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
        int int18 = stackArrayList0.pop();
        boolean boolean19 = stackArrayList0.isEmpty();
        stackArrayList0.push(3);
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
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
        int int25 = stackArrayList0.peek();
        int int26 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 5 + "'", int26 == 5);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push((int) '#');
        int int14 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
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
        int int17 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        stackArrayList0.push(32);
        stackArrayList0.push(32);
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.pop();
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass11 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        stackArrayList0.push(0);
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(97);
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push(0);
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.pop();
        stackArrayList0.push(100);
        int int13 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
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
        boolean boolean24 = stackArrayList0.isEmpty();
        int int25 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
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
        stackArrayList0.push(6);
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        int int7 = stackArrayList0.size();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(100);
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
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
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(1);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
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
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.pop();
        stackArrayList0.push(52);
        int int22 = stackArrayList0.pop();
        int int23 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
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
        stackArrayList0.push(6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
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
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
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
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '#');
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 10);
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass15 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
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
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
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
        int int16 = stackArrayList0.pop();
        stackArrayList0.push(0);
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push(32);
        stackArrayList0.push(0);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.peek();
        boolean boolean14 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
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
        int int15 = stackArrayList0.size();
        int int16 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 10);
        boolean boolean19 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
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
        stackArrayList0.push((int) (short) 1);
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
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
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 0);
        stackArrayList0.push((int) '#');
        stackArrayList0.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.size();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
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
        int int26 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int29 = stackArrayList0.peek();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
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
        int int18 = stackArrayList0.pop();
        boolean boolean19 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
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
        int int19 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
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
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean17 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
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
        boolean boolean20 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass21 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
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
        int int15 = stackArrayList0.peek();
        int int16 = stackArrayList0.peek();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
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
        int int14 = stackArrayList0.peek();
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 1);
        stackArrayList0.push(0);
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push(0);
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 1);
        stackArrayList0.push((int) 'a');
        stackArrayList0.push((int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        stackArrayList0.push(97);
        int int9 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
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
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        boolean boolean4 = stackArrayList0.isEmpty();
        int int5 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 10);
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
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
        int int16 = stackArrayList0.peek();
        stackArrayList0.push(10);
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        stackArrayList0.push((int) '4');
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        stackArrayList0.push(10);
        int int14 = stackArrayList0.pop();
        stackArrayList0.push(35);
        int int17 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
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
        boolean boolean21 = stackArrayList0.isEmpty();
        int int22 = stackArrayList0.peek();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
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
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
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
        int int16 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = stackArrayList0.pop();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
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
        boolean boolean17 = stackArrayList0.isEmpty();
        boolean boolean18 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.size();
        boolean boolean5 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
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
        int int16 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 0);
        boolean boolean19 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
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
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
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
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.pop();
        stackArrayList0.push(4);
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
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
        int int18 = stackArrayList0.pop();
        boolean boolean19 = stackArrayList0.isEmpty();
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.pop();
        boolean boolean22 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
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
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
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
        stackArrayList0.push(7);
        boolean boolean21 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        int int24 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 0);
        int int27 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass9 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        boolean boolean5 = stackArrayList0.isEmpty();
        stackArrayList0.push(100);
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.size();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        stackArrayList0.push((int) (short) 10);
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
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
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.peek();
        stackArrayList0.push(0);
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
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
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass10 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 1);
        boolean boolean18 = stackArrayList0.isEmpty();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
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
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
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
        stackArrayList0.push((int) (short) 10);
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
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
        stackArrayList0.push(10);
        stackArrayList0.push(10);
        int int21 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int24 = stackArrayList0.size();
        stackArrayList0.push(7);
        stackArrayList0.push(35);
        java.lang.Class<?> wildcardClass29 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        boolean boolean5 = stackArrayList0.isEmpty();
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        stackArrayList0.push(1);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.size();
        stackArrayList0.push((int) ' ');
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.pop();
        int int8 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
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
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.peek();
        int int20 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
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
        int int22 = stackArrayList0.size();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
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
        stackArrayList0.push((int) '4');
        boolean boolean24 = stackArrayList0.isEmpty();
        int int25 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 7 + "'", int25 == 7);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        int int13 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (byte) 100);
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.size();
        stackArrayList0.push((int) (byte) 100);
        int int20 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 100);
        int int8 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.size();
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
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
        int int13 = stackArrayList0.size();
        boolean boolean14 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        stackArrayList0.push(52);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(100);
        int int11 = stackArrayList0.peek();
        int int12 = stackArrayList0.peek();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
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
        int int16 = stackArrayList0.peek();
        int int17 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        stackArrayList0.push(4);
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
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
        stackArrayList0.push((int) (short) 1);
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        boolean boolean18 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) '#');
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 1);
        boolean boolean18 = stackArrayList0.isEmpty();
        boolean boolean19 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
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
        int int15 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
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
        boolean boolean13 = stackArrayList0.isEmpty();
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) '4');
        int int8 = stackArrayList0.pop();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push(1);
        stackArrayList0.push(0);
        int int9 = stackArrayList0.peek();
        boolean boolean10 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) -1);
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.pop();
        stackArrayList0.push(0);
        int int17 = stackArrayList0.pop();
        boolean boolean18 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
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
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.peek();
        boolean boolean22 = stackArrayList0.isEmpty();
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
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
        stackArrayList0.push((int) ' ');
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        stackArrayList0.push(97);
        boolean boolean8 = stackArrayList0.isEmpty();
        int int9 = stackArrayList0.pop();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
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
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
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
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.peek();
        boolean boolean21 = stackArrayList0.isEmpty();
        int int22 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '#');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.peek();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.pop();
        boolean boolean11 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((int) (byte) 0);
        int int9 = stackArrayList0.pop();
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        int int13 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
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
        stackArrayList0.push(4);
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.size();
        stackArrayList0.push((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.size();
        stackArrayList0.push(6);
        stackArrayList0.push(97);
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
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
        stackArrayList0.push((int) ' ');
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.peek();
        int int18 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
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
        stackArrayList0.push(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push(97);
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
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
        int int13 = stackArrayList0.pop();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
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
        int int14 = stackArrayList0.size();
        int int15 = stackArrayList0.peek();
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) (byte) 100);
        int int23 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        int int10 = stackArrayList0.peek();
        int int11 = stackArrayList0.peek();
        boolean boolean12 = stackArrayList0.isEmpty();
        boolean boolean13 = stackArrayList0.isEmpty();
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push((int) (byte) -1);
        stackArrayList0.push((int) (byte) 0);
        int int13 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        stackArrayList0.push(100);
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
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
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int8 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass9 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
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
        stackArrayList0.push((int) ' ');
        int int20 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
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
        int int16 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push((int) (short) 0);
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
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
        stackArrayList0.push((int) (byte) 1);
        int int17 = stackArrayList0.size();
        int int18 = stackArrayList0.peek();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.peek();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        boolean boolean12 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int15 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 1);
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
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
        stackArrayList0.push((int) (byte) 10);
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
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
        int int13 = stackArrayList0.peek();
        int int14 = stackArrayList0.peek();
        boolean boolean15 = stackArrayList0.isEmpty();
        int int16 = stackArrayList0.size();
        int int17 = stackArrayList0.peek();
        stackArrayList0.push(1);
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(0);
        int int11 = stackArrayList0.peek();
        stackArrayList0.push(6);
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
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
        int int18 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        stackArrayList0.push((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
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
        int int24 = stackArrayList0.pop();
        int int25 = stackArrayList0.pop();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        int int10 = stackArrayList0.size();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 100);
        boolean boolean6 = stackArrayList0.isEmpty();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.pop();
        int int9 = stackArrayList0.size();
        int int10 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
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
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        stackArrayList0.push(4);
        java.lang.Class<?> wildcardClass23 = stackArrayList0.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.pop();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
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
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.pop();
        boolean boolean21 = stackArrayList0.isEmpty();
        stackArrayList0.push(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
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
        int int14 = stackArrayList0.pop();
        boolean boolean15 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
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
        int int19 = stackArrayList0.size();
        int int20 = stackArrayList0.peek();
        int int21 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
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
        // The following exception was thrown during execution in test generation
        try {
            int int12 = stackArrayList0.peek();
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
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
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
        int int21 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
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
        int int21 = stackArrayList0.pop();
        stackArrayList0.push(0);
        boolean boolean24 = stackArrayList0.isEmpty();
        int int25 = stackArrayList0.size();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(4);
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
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
        int int17 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass18 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
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
        int int25 = stackArrayList0.peek();
        int int26 = stackArrayList0.peek();
        int int27 = stackArrayList0.pop();
        boolean boolean28 = stackArrayList0.isEmpty();
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        stackArrayList0.push(3);
        int int11 = stackArrayList0.pop();
        boolean boolean12 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        stackArrayList0.push(4);
        int int8 = stackArrayList0.peek();
        int int9 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
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
        stackArrayList0.push((int) (short) 1);
        int int20 = stackArrayList0.size();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.peek();
        int int5 = stackArrayList0.peek();
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push(32);
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
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
        boolean boolean19 = stackArrayList0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
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
        stackArrayList0.push(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
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
        stackArrayList0.push(0);
        stackArrayList0.push((int) ' ');
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
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.peek();
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) (byte) 0);
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.pop();
        int int12 = stackArrayList0.size();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = stackArrayList0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
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
        boolean boolean20 = stackArrayList0.isEmpty();
        int int21 = stackArrayList0.size();
        int int22 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        int int10 = stackArrayList0.size();
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
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
        int int18 = stackArrayList0.size();
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.peek();
        stackArrayList0.push(97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        boolean boolean15 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        int int7 = stackArrayList0.size();
        int int8 = stackArrayList0.pop();
        stackArrayList0.push((int) ' ');
        stackArrayList0.push(10);
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
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
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
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
        boolean boolean17 = stackArrayList0.isEmpty();
        int int18 = stackArrayList0.peek();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
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
        int int20 = stackArrayList0.size();
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        stackArrayList0.push((int) '4');
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push((int) (byte) 100);
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        stackArrayList0.push((int) (byte) 10);
        int int8 = stackArrayList0.size();
        int int9 = stackArrayList0.peek();
        int int10 = stackArrayList0.pop();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.size();
        boolean boolean13 = stackArrayList0.isEmpty();
        stackArrayList0.push(3);
        int int16 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
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
        stackArrayList0.push(7);
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        boolean boolean2 = stackArrayList0.isEmpty();
        int int3 = stackArrayList0.size();
        boolean boolean4 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        int int7 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
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
        int int18 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
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
        int int15 = stackArrayList0.pop();
        int int16 = stackArrayList0.pop();
        int int17 = stackArrayList0.pop();
        int int18 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) -1);
        stackArrayList0.push((-1));
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(97);
        int int12 = stackArrayList0.pop();
        int int13 = stackArrayList0.size();
        int int14 = stackArrayList0.peek();
        stackArrayList0.push(0);
        stackArrayList0.push(3);
        stackArrayList0.push(97);
        int int21 = stackArrayList0.pop();
        int int22 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
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
        int int17 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push(32);
        int int4 = stackArrayList0.size();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.peek();
        stackArrayList0.push(1);
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push(9);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
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
        int int22 = stackArrayList0.peek();
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
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
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
        int int18 = stackArrayList0.size();
        int int19 = stackArrayList0.pop();
        boolean boolean20 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
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
        boolean boolean21 = stackArrayList0.isEmpty();
        boolean boolean22 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass23 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        boolean boolean3 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (short) 0);
        int int6 = stackArrayList0.size();
        int int7 = stackArrayList0.pop();
        stackArrayList0.push(97);
        int int10 = stackArrayList0.peek();
        boolean boolean11 = stackArrayList0.isEmpty();
        stackArrayList0.push(0);
        stackArrayList0.push((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
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
        int int13 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
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
        boolean boolean19 = stackArrayList0.isEmpty();
        int int20 = stackArrayList0.pop();
        int int21 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass22 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        boolean boolean2 = stackArrayList0.isEmpty();
        boolean boolean3 = stackArrayList0.isEmpty();
        boolean boolean4 = stackArrayList0.isEmpty();
        stackArrayList0.push(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        int int7 = stackArrayList0.peek();
        stackArrayList0.push((int) '#');
        boolean boolean10 = stackArrayList0.isEmpty();
        int int11 = stackArrayList0.size();
        int int12 = stackArrayList0.peek();
        stackArrayList0.push((int) 'a');
        boolean boolean15 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
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
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        boolean boolean6 = stackArrayList0.isEmpty();
        int int7 = stackArrayList0.peek();
        int int8 = stackArrayList0.size();
        boolean boolean9 = stackArrayList0.isEmpty();
        stackArrayList0.push((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
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
        int int15 = stackArrayList0.peek();
        java.lang.Class<?> wildcardClass16 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
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
        stackArrayList0.push((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        int int17 = stackArrayList0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
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
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
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
        int int18 = stackArrayList0.pop();
        int int19 = stackArrayList0.pop();
        int int20 = stackArrayList0.pop();
        boolean boolean21 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
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
        boolean boolean14 = stackArrayList0.isEmpty();
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
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
        int int15 = stackArrayList0.size();
        boolean boolean16 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
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
        int int15 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
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
        boolean boolean16 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
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
        stackArrayList0.push(6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
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
        stackArrayList0.push((int) (short) 100);
        boolean boolean21 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 0);
        int int24 = stackArrayList0.pop();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.peek();
        int int4 = stackArrayList0.peek();
        stackArrayList0.push((int) (short) 0);
        boolean boolean7 = stackArrayList0.isEmpty();
        boolean boolean8 = stackArrayList0.isEmpty();
        boolean boolean9 = stackArrayList0.isEmpty();
        int int10 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
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
        int int12 = stackArrayList0.peek();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.pop();
        stackArrayList0.push((int) (short) 10);
        int int6 = stackArrayList0.pop();
        boolean boolean7 = stackArrayList0.isEmpty();
        int int8 = stackArrayList0.size();
        stackArrayList0.push(52);
        boolean boolean11 = stackArrayList0.isEmpty();
        int int12 = stackArrayList0.pop();
        boolean boolean13 = stackArrayList0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        int int1 = stackArrayList0.size();
        stackArrayList0.push((int) (short) 0);
        int int4 = stackArrayList0.pop();
        boolean boolean5 = stackArrayList0.isEmpty();
        boolean boolean6 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        com.thealgorithms.datastructures.stacks.StackArrayList stackArrayList0 = new com.thealgorithms.datastructures.stacks.StackArrayList();
        stackArrayList0.push((int) '#');
        int int3 = stackArrayList0.size();
        int int4 = stackArrayList0.pop();
        int int5 = stackArrayList0.size();
        int int6 = stackArrayList0.size();
        boolean boolean7 = stackArrayList0.isEmpty();
        stackArrayList0.push((int) (byte) 10);
        stackArrayList0.push((int) (short) 10);
        int int12 = stackArrayList0.pop();
        java.lang.Class<?> wildcardClass13 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
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
        int int24 = stackArrayList0.size();
        boolean boolean25 = stackArrayList0.isEmpty();
        java.lang.Class<?> wildcardClass26 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
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
        int int19 = stackArrayList0.size();
        java.lang.Class<?> wildcardClass20 = stackArrayList0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }
}

