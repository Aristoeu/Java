package datastructures.hashmap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(1);
        int int14 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.insertHash(48);
        hashMapLinearProbing1.insertHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int14 = hashMapLinearProbing1.hashing(16);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(45);
        int int16 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.insertHash(45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(48);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int13 = hashMapLinearProbing1.hashing((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27 + "'", int13 == 27);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.findHash(10);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30 + "'", int16 == 30);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(27);
        int int3 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.insertHash(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(1);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean22 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int12 = hashMapLinearProbing1.findHash(35);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        int int10 = hashMapLinearProbing1.findHash(16);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int17 = hashMapLinearProbing1.hashing((int) ' ');
        int int19 = hashMapLinearProbing1.hashing(45);
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        int int22 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int14 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int16 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.findHash(14);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.hashing(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.insertHash((-1));
        boolean boolean17 = hashMapLinearProbing1.isFull();
        int int19 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.deleteHash(30);
        boolean boolean22 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass23 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(0);
        int int12 = hashMapLinearProbing1.findHash(51);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) ' ');
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing((int) '#');
        int int12 = hashMapLinearProbing1.findHash(100);
        int int14 = hashMapLinearProbing1.findHash(96);
        hashMapLinearProbing1.displayHashtable();
        int int17 = hashMapLinearProbing1.findHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.insertHash(2);
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 0);
        int int11 = hashMapLinearProbing1.hashing((int) 'a');
        int int13 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(99);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(1);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash(45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(100);
        int int17 = hashMapLinearProbing1.findHash((int) (byte) 10);
        boolean boolean18 = hashMapLinearProbing1.isFull();
        int int20 = hashMapLinearProbing1.hashing(12);
        int int22 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.deleteHash(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 34 + "'", int22 == 34);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.findHash((int) (byte) 1);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(32);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) ' ');
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        int int13 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash(96);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(32);
        int int15 = hashMapLinearProbing1.hashing((int) '4');
        int int17 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        boolean boolean20 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17 + "'", int15 == 17);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(26);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) '4');
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.findHash((int) '4');
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int16 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.insertHash((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(10);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.hashing(51);
        hashMapLinearProbing1.deleteHash(9);
        int int12 = hashMapLinearProbing1.hashing(14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass4 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.hashing(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30 + "'", int16 == 30);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int12 = hashMapLinearProbing1.hashing(0);
        int int14 = hashMapLinearProbing1.hashing(16);
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(32);
        int int15 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17 + "'", int15 == 17);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(34);
        boolean boolean22 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30 + "'", int16 == 30);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean19 = hashMapLinearProbing1.isFull();
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.insertHash(10);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.findHash((int) '4');
        int int16 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.findHash(34);
        int int10 = hashMapLinearProbing1.findHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.hashing(1);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) -1);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        int int7 = hashMapLinearProbing1.findHash(3);
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(1);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        int int20 = hashMapLinearProbing1.findHash((int) (short) 1);
        int int22 = hashMapLinearProbing1.hashing(7);
        boolean boolean23 = hashMapLinearProbing1.isEmpty();
        boolean boolean24 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.findHash((int) 'a');
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        int int21 = hashMapLinearProbing1.hashing(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash(2);
        hashMapLinearProbing1.insertHash(26);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) 'a');
        int int13 = hashMapLinearProbing1.hashing(100);
        hashMapLinearProbing1.insertHash(34);
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.deleteHash(7);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.insertHash(9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.hashing(45);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 45 + "'", int15 == 45);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int9 = hashMapLinearProbing1.hashing(48);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.insertHash(10);
        hashMapLinearProbing1.deleteHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(44);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(32);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int14 = hashMapLinearProbing1.findHash(30);
        int int16 = hashMapLinearProbing1.hashing((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.findHash((int) ' ');
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean18 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        int int16 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.insertHash(27);
        boolean boolean21 = hashMapLinearProbing1.isFull();
        boolean boolean22 = hashMapLinearProbing1.isFull();
        boolean boolean23 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.hashing(15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int16 = hashMapLinearProbing1.hashing((int) ' ');
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        int int14 = hashMapLinearProbing1.findHash((int) (byte) 10);
        int int16 = hashMapLinearProbing1.hashing(44);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean18 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.findHash(12);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        int int19 = hashMapLinearProbing1.hashing((int) (byte) -1);
        int int21 = hashMapLinearProbing1.findHash(100);
        boolean boolean22 = hashMapLinearProbing1.isEmpty();
        int int24 = hashMapLinearProbing1.hashing(9);
        int int26 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int28 = hashMapLinearProbing1.findHash(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34 + "'", int19 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) (short) -1);
        int int13 = hashMapLinearProbing1.findHash(35);
        int int15 = hashMapLinearProbing1.hashing(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        int int13 = hashMapLinearProbing1.hashing((int) '4');
        int int15 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int21 = hashMapLinearProbing1.hashing((int) (byte) -1);
        int int23 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int16 = hashMapLinearProbing1.hashing(7);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.findHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) '#');
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.insertHash(12);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(14);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash(12);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        int int4 = hashMapLinearProbing1.findHash(30);
        hashMapLinearProbing1.deleteHash(5);
        int int8 = hashMapLinearProbing1.findHash(5);
        int int10 = hashMapLinearProbing1.hashing(99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.findHash(51);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.deleteHash((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.deleteHash(7);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int13 = hashMapLinearProbing1.hashing(12);
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(11);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int9 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.insertHash(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int7 = hashMapLinearProbing1.findHash((-1));
        int int9 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.findHash((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(48);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash(51);
        int int13 = hashMapLinearProbing1.hashing(44);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing(32);
        int int14 = hashMapLinearProbing1.hashing(44);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        int int19 = hashMapLinearProbing1.findHash(26);
        int int21 = hashMapLinearProbing1.hashing(11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash(30);
        int int15 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing(96);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        int int12 = hashMapLinearProbing1.hashing((-1));
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int8 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(34);
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        int int10 = hashMapLinearProbing1.hashing((int) (byte) -1);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) 'a');
        int int13 = hashMapLinearProbing1.findHash((int) '#');
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.insertHash(13);
        int int24 = hashMapLinearProbing1.findHash((int) '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.findHash((int) 'a');
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash(15);
        int int13 = hashMapLinearProbing1.findHash((-1));
        int int15 = hashMapLinearProbing1.findHash(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(15);
        int int21 = hashMapLinearProbing1.findHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int9 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.findHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((-1));
        int int15 = hashMapLinearProbing1.hashing(16);
        int int17 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        int int16 = hashMapLinearProbing1.hashing(12);
        hashMapLinearProbing1.deleteHash(27);
        int int20 = hashMapLinearProbing1.findHash((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash(44);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        int int8 = hashMapLinearProbing1.findHash(10);
        int int10 = hashMapLinearProbing1.findHash(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(44);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(14);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing((int) (short) 100);
        int int19 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        int int8 = hashMapLinearProbing1.findHash((-1));
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(48);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int10 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) 'a');
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapLinearProbing1.insertHash(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapLinearProbing1.insertHash(45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(9);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(48);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        int int10 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash(32);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        int int4 = hashMapLinearProbing1.hashing(34);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int19 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.deleteHash(51);
        java.lang.Class<?> wildcardClass22 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        int int13 = hashMapLinearProbing1.hashing((int) '4');
        int int15 = hashMapLinearProbing1.hashing((int) (short) -1);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.hashing(9);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        int int4 = hashMapLinearProbing1.hashing(34);
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.findHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash(48);
        int int11 = hashMapLinearProbing1.findHash(16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(32);
        hashMapLinearProbing1.displayHashtable();
        int int4 = hashMapLinearProbing1.hashing(48);
        hashMapLinearProbing1.checkLoadFactor();
        int int7 = hashMapLinearProbing1.hashing(14);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 14 + "'", int7 == 14);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.findHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(45);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash(0);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(15);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(26);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean22 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 10);
        int int10 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int12 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.insertHash(32);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int8 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int15 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean17 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(48);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int14 = hashMapLinearProbing1.hashing((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(27);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(27);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        boolean boolean18 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(16);
        int int22 = hashMapLinearProbing1.hashing(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean18 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int22 = hashMapLinearProbing1.hashing(27);
        boolean boolean23 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 27 + "'", int22 == 27);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean23 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash(35);
        int int15 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        int int17 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int22 = hashMapLinearProbing1.findHash(45);
        hashMapLinearProbing1.deleteHash(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        int int14 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash((int) '#');
        int int18 = hashMapLinearProbing1.findHash(0);
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.findHash((int) ' ');
        hashMapLinearProbing1.insertHash(100);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        boolean boolean18 = hashMapLinearProbing1.isFull();
        int int20 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.displayHashtable();
        int int23 = hashMapLinearProbing1.findHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(16);
        java.lang.Class<?> wildcardClass2 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int17 = hashMapLinearProbing1.hashing((int) ' ');
        int int19 = hashMapLinearProbing1.hashing(45);
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int23 = hashMapLinearProbing1.hashing(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.hashing(34);
        int int12 = hashMapLinearProbing1.findHash((-1));
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(0);
        int int17 = hashMapLinearProbing1.findHash(9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(48);
        int int9 = hashMapLinearProbing1.findHash(15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        int int13 = hashMapLinearProbing1.hashing((int) '4');
        int int15 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean17 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int21 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        int int16 = hashMapLinearProbing1.findHash((int) '#');
        hashMapLinearProbing1.insertHash(34);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        int int21 = hashMapLinearProbing1.findHash(12);
        java.lang.Class<?> wildcardClass22 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.displayHashtable();
        int int20 = hashMapLinearProbing1.hashing((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 17 + "'", int20 == 17);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        int int8 = hashMapLinearProbing1.findHash(10);
        int int10 = hashMapLinearProbing1.findHash(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int17 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(9);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        int int10 = hashMapLinearProbing1.findHash((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) '4');
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.findHash((int) (byte) 1);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(32);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(13);
        java.lang.Class<?> wildcardClass22 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        int int7 = hashMapLinearProbing1.hashing(0);
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash((int) (short) -1);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        int int16 = hashMapLinearProbing1.findHash(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.findHash((int) ' ');
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean18 = hashMapLinearProbing1.isFull();
        int int20 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(1);
        hashMapLinearProbing1.insertHash(15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 100);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(9);
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.hashing(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.findHash((int) 'a');
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(48);
        int int19 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(30);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.checkLoadFactor();
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        int int13 = hashMapLinearProbing1.hashing((int) '4');
        int int15 = hashMapLinearProbing1.hashing((int) (short) -1);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass20 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        int int12 = hashMapLinearProbing1.findHash(17);
        hashMapLinearProbing1.deleteHash(96);
        int int16 = hashMapLinearProbing1.findHash((int) (byte) 1);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((-1));
        int int9 = hashMapLinearProbing1.hashing((int) (short) 10);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(30);
        int int12 = hashMapLinearProbing1.findHash(9);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 1);
        int int16 = hashMapLinearProbing1.findHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.hashing(35);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(13);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int6 = hashMapLinearProbing1.findHash((int) 'a');
        int int8 = hashMapLinearProbing1.hashing(44);
        hashMapLinearProbing1.deleteHash(0);
        int int12 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash(13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(30);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        int int4 = hashMapLinearProbing1.findHash(35);
        int int6 = hashMapLinearProbing1.hashing((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(17);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(35);
        int int9 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.hashing(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(9);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((-1));
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.insertHash((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.insertHash(30);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.findHash((int) '#');
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.findHash(9);
        int int9 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.insertHash(13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(35);
        int int15 = hashMapLinearProbing1.findHash(26);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(34);
        int int13 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing(45);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 45 + "'", int8 == 45);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.hashing(7);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.hashing(10);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        int int14 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(0);
        int int15 = hashMapLinearProbing1.findHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash(13);
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int6 = hashMapLinearProbing1.hashing(45);
        int int8 = hashMapLinearProbing1.findHash(45);
        int int10 = hashMapLinearProbing1.findHash((int) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 45 + "'", int6 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.insertHash(15);
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.findHash(14);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        int int3 = hashMapLinearProbing1.findHash(9);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(12);
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.insertHash(48);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean14 = hashMapLinearProbing1.isFull();
        int int16 = hashMapLinearProbing1.hashing((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash(14);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash(44);
        int int20 = hashMapLinearProbing1.findHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        int int13 = hashMapLinearProbing1.findHash((int) (byte) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(2);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash(32);
        int int13 = hashMapLinearProbing1.hashing(3);
        int int15 = hashMapLinearProbing1.findHash(0);
        int int17 = hashMapLinearProbing1.findHash(13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.insertHash(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash(45);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(2);
        hashMapLinearProbing1.deleteHash(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        int int16 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.hashing(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(1);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(0);
        boolean boolean21 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        int int10 = hashMapLinearProbing1.findHash(12);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 45 + "'", int8 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(32);
        int int13 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.insertHash(1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(96);
        int int14 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.insertHash(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.hashing((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int12 = hashMapLinearProbing1.hashing(0);
        int int14 = hashMapLinearProbing1.findHash(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int8 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(34);
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(2);
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash((int) (byte) 0);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) 'a');
        int int17 = hashMapLinearProbing1.findHash(17);
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(10);
        int int6 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.deleteHash(13);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(34);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash(27);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int7 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int14 = hashMapLinearProbing1.findHash(45);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        int int21 = hashMapLinearProbing1.hashing((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass4 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(100);
        int int15 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.findHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(32);
        int int15 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(0);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.findHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        int int6 = hashMapLinearProbing1.findHash(100);
        int int8 = hashMapLinearProbing1.findHash(13);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int14 = hashMapLinearProbing1.hashing(27);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27 + "'", int14 == 27);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(48);
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        int int13 = hashMapLinearProbing1.hashing((int) '4');
        int int15 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        int int19 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean22 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        int int10 = hashMapLinearProbing1.hashing((int) (byte) -1);
        int int12 = hashMapLinearProbing1.findHash(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        int int10 = hashMapLinearProbing1.hashing(48);
        int int12 = hashMapLinearProbing1.hashing(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        int int16 = hashMapLinearProbing1.hashing(1);
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int21 = hashMapLinearProbing1.findHash(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(16);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(1);
        int int19 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        int int23 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int25 = hashMapLinearProbing1.findHash(52);
        boolean boolean26 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int5 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int15 = hashMapLinearProbing1.hashing(0);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(45);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(10);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 100);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(9);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(2);
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.findHash(26);
        int int18 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int12 = hashMapLinearProbing1.hashing((int) '4');
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.deleteHash(29);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash((int) ' ');
        int int8 = hashMapLinearProbing1.hashing(48);
        int int10 = hashMapLinearProbing1.hashing(44);
        int int12 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(2);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.hashing(99);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int12 = hashMapLinearProbing1.findHash(35);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(17);
        int int10 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        int int23 = hashMapLinearProbing1.findHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int14 = hashMapLinearProbing1.hashing(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash(12);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        int int20 = hashMapLinearProbing1.findHash((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(51);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.deleteHash(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.insertHash((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((int) (byte) 1);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        int int10 = hashMapLinearProbing1.hashing((int) (short) 100);
        int int12 = hashMapLinearProbing1.findHash(51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(45);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.deleteHash(30);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash(35);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.insertHash(35);
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.insertHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) 'a');
        int int16 = hashMapLinearProbing1.hashing(17);
        hashMapLinearProbing1.checkLoadFactor();
        int int19 = hashMapLinearProbing1.findHash(12);
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        int int9 = hashMapLinearProbing1.findHash(10);
        int int11 = hashMapLinearProbing1.findHash(1);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing(3);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        int int10 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash(100);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(14);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int14 = hashMapLinearProbing1.hashing(16);
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.insertHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(12);
        hashMapLinearProbing1.deleteHash(32);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash(16);
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) '#');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean17 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27 + "'", int16 == 27);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.insertHash(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.hashing(30);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing(44);
        hashMapLinearProbing1.deleteHash(96);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        int int18 = hashMapLinearProbing1.hashing(29);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        boolean boolean22 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.hashing(1);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) -1);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.insertHash(17);
        int int18 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        int int21 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash((int) '4');
        boolean boolean16 = hashMapLinearProbing1.isFull();
        int int18 = hashMapLinearProbing1.hashing((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(96);
        hashMapLinearProbing1.deleteHash(1);
        hashMapLinearProbing1.checkLoadFactor();
        int int25 = hashMapLinearProbing1.hashing(30);
        boolean boolean26 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.deleteHash((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.findHash((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.insertHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        boolean boolean5 = hashMapLinearProbing1.isFull();
        int int7 = hashMapLinearProbing1.findHash(29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        int int14 = hashMapLinearProbing1.hashing(0);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.findHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.hashing((-1));
        int int14 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.findHash(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int10 = hashMapLinearProbing1.findHash(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.findHash((int) 'a');
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.deleteHash(30);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(48);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        int int13 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        int int17 = hashMapLinearProbing1.hashing((int) (short) 0);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(96);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.insertHash(14);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(10);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(5);
        hashMapLinearProbing1.deleteHash(1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.insertHash(2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(44);
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.hashing((int) '#');
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(12);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.findHash(27);
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(34);
        int int22 = hashMapLinearProbing1.hashing((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.deleteHash(7);
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.insertHash((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing((int) (short) 100);
        int int15 = hashMapLinearProbing1.hashing(0);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.hashing(1);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        int int7 = hashMapLinearProbing1.hashing(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 17 + "'", int7 == 17);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        boolean boolean22 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int25 = hashMapLinearProbing1.hashing((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int15 = hashMapLinearProbing1.hashing(99);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(17);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(32);
        int int17 = hashMapLinearProbing1.findHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        int int5 = hashMapLinearProbing1.findHash((int) '4');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass7 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int19 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int18 = hashMapLinearProbing1.findHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        int int12 = hashMapLinearProbing1.findHash(10);
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.insertHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(7);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(1);
        int int8 = hashMapLinearProbing1.findHash((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int8 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.insertHash(51);
        hashMapLinearProbing1.deleteHash(12);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.findHash(10);
        int int17 = hashMapLinearProbing1.findHash(5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(13);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int16 = hashMapLinearProbing1.hashing((int) ' ');
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean18 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(35);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(2);
        int int16 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing((int) '4');
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 17 + "'", int14 == 17);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        int int15 = hashMapLinearProbing1.findHash(35);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((-1));
        int int20 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        int int23 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int25 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27 + "'", int20 == 27);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(100);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.findHash(0);
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        int int19 = hashMapLinearProbing1.hashing((int) (byte) -1);
        int int21 = hashMapLinearProbing1.hashing(3);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34 + "'", int19 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing(32);
        int int14 = hashMapLinearProbing1.hashing(44);
        int int16 = hashMapLinearProbing1.findHash(1);
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        int int19 = hashMapLinearProbing1.findHash(96);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.deleteHash((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) 'a');
        int int12 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.deleteHash(30);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hashMapLinearProbing1.hashing((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.insertHash(35);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean17 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing(29);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int22 = hashMapLinearProbing1.hashing(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.insertHash((int) ' ');
        int int10 = hashMapLinearProbing1.hashing(12);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(1);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        int int20 = hashMapLinearProbing1.findHash((int) (short) 1);
        int int22 = hashMapLinearProbing1.hashing(7);
        hashMapLinearProbing1.deleteHash(14);
        int int26 = hashMapLinearProbing1.hashing((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(35);
        int int9 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int11 = hashMapLinearProbing1.findHash(48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.findHash(9);
        int int9 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) ' ');
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(48);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27 + "'", int10 == 27);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.deleteHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(16);
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(48);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.insertHash(0);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.findHash(1);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        boolean boolean17 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.insertHash(15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) ' ');
        int int12 = hashMapLinearProbing1.hashing((-1));
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(2);
        hashMapLinearProbing1.deleteHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(100);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        int int18 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.deleteHash((int) '#');
        int int22 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash(51);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(100);
        int int12 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.displayHashtable();
        int int14 = hashMapLinearProbing1.findHash(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapLinearProbing1.findHash(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(1);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        int int20 = hashMapLinearProbing1.findHash((int) (short) 1);
        int int22 = hashMapLinearProbing1.hashing(7);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean24 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) 'a');
        int int16 = hashMapLinearProbing1.hashing(17);
        hashMapLinearProbing1.insertHash(29);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(26);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 26 + "'", int12 == 26);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash(32);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        int int7 = hashMapLinearProbing1.hashing(45);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass6 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash(11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean18 = hashMapLinearProbing1.isFull();
        boolean boolean19 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        boolean boolean22 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(0);
        int int15 = hashMapLinearProbing1.hashing(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(99);
        int int11 = hashMapLinearProbing1.findHash((int) (short) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int11 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        int int8 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.displayHashtable();
        int int4 = hashMapLinearProbing1.hashing(32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(48);
        int int6 = hashMapLinearProbing1.findHash(35);
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        int int9 = hashMapLinearProbing1.findHash((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.hashing(30);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.insertHash(15);
        hashMapLinearProbing1.insertHash(12);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean20 = hashMapLinearProbing1.isFull();
        int int22 = hashMapLinearProbing1.hashing(1);
        boolean boolean23 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.findHash((int) (short) -1);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(2);
        int int13 = hashMapLinearProbing1.findHash(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(2);
        hashMapLinearProbing1.checkLoadFactor();
        int int7 = hashMapLinearProbing1.hashing((int) '4');
        boolean boolean8 = hashMapLinearProbing1.isFull();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.findHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(9);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.insertHash(1);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.hashing(14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) '#');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        int int5 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash(9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(14);
        hashMapLinearProbing1.displayHashtable();
        int int4 = hashMapLinearProbing1.findHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(96);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.hashing(10);
        hashMapLinearProbing1.deleteHash(12);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.findHash(9);
        int int9 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.deleteHash((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.hashing((-1));
        int int14 = hashMapLinearProbing1.findHash(34);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(100);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(35);
        int int20 = hashMapLinearProbing1.hashing(0);
        int int22 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.deleteHash(100);
        int int26 = hashMapLinearProbing1.hashing(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.findHash(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(51);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((-1));
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.hashing(100);
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.insertHash(34);
        int int15 = hashMapLinearProbing1.hashing(13);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(32);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
    }
}

